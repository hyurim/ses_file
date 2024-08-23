package com.dsa.web5.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.dsa.web5.dto.BoardDTO;
import com.dsa.web5.dto.ReplyDTO;
import com.dsa.web5.entity.BoardEntity;
import com.dsa.web5.entity.MemberEntity;
import com.dsa.web5.entity.ReplyEntity;
import com.dsa.web5.repository.BoardRepository;
import com.dsa.web5.repository.MemberRepository;
import com.dsa.web5.repository.ReplyRepository;
import com.dsa.web5.security.AuthenticatedUser;
import com.dsa.web5.util.FileManager;

import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional
public class BoardServiceImpl implements BoardService {
	private final BoardRepository boardRepository;
	private final MemberRepository memberRepository; 
	private final ReplyRepository replyRepository;
	private final FileManager fileManager;
	
	@Override
	public void write(BoardDTO boardDTO, String uploadPath, MultipartFile upload) throws IOException {
	    // 아이디로 회원 엔터티 조회, 없으면 예외 발생
	    MemberEntity memberEntity = 
	            memberRepository.findById(boardDTO.getMemberId())
	            .orElseThrow(() -> new EntityNotFoundException("아이디가 없습니다."));

	    // 새로운 게시물 엔터티 생성 및 설정
	    BoardEntity entity = new BoardEntity();
	    entity.setMemberId(memberEntity);
	    entity.setTitle(boardDTO.getTitle());
	    entity.setContents(boardDTO.getContents());

	    // 첨부파일이 있는 경우 처리
	    if (upload != null && !upload.isEmpty()) {
	        String fileName = fileManager.saveFile(uploadPath, upload);  // 파일 저장 후 파일명 반환
	        entity.setFileName(fileName);                              // 저장된 파일명 설정
	        entity.setOriginalName(upload.getOriginalFilename());        // 원본 파일명 저장
	        
	    }

	    // 게시물 엔터티 저장
	    boardRepository.save(entity);
	}

	@Override
	public List<BoardDTO> selectAllData() {
		
		// boardNum을 정렬기준으로 데이터를 entity로 가져오기
		Sort sort = Sort.by(Sort.Direction.DESC,"boardNum");
		List<BoardEntity> entityList = boardRepository.findAll(sort);
		
		// entity 데이터를 dto 데이터로 옮겨닮기
		List<BoardDTO> dtoList = new ArrayList<>();
		for(BoardEntity entity : entityList) {
			BoardDTO dto = BoardDTO.builder()
					.boardNum(entity.getBoardNum())
					.memberId(entity.getMemberId().getMemberId())
					.memberName(entity.getMemberId().getMemberName())
					.title(entity.getTitle())
					.contents(entity.getContents())
					.viewCount(entity.getViewCount())
					.likeCount(entity.getLikeCount())
					.originalName(entity.getOriginalName())
					.fileName(entity.getFileName())
					.createDate(entity.getCreateDate())
					.updateDate(entity.getUpdateDate())
					.build();
			dtoList.add(dto);
		}
		return dtoList;
	}

	
	@Override
	public BoardDTO getBoard(int boardNum) {

		// boardNum에 일치하는 게시글이 있는지 확인
		BoardEntity board = boardRepository.findById(boardNum)
				.orElseThrow(() -> 
				new EntityNotFoundException("해당 번호의 글이 없습니다."));
		
		log.debug("[service-find] memberEntity : {} ", board);

		// entity의 viewCount + 1
		int updateViewCount = board.getViewCount() + 1;
		board.setViewCount(updateViewCount);
		boardRepository.save(board);

		// 존재한다면 entity의 정보를 dto에 옮겨 담기
		BoardDTO dto = convertDTO(board);
		
		// 리플 정보 가져오기
		List<ReplyDTO> replyDTOList = new ArrayList<ReplyDTO>();
		for (ReplyEntity replyEntity : board.getReplyList()) {
			ReplyDTO replyDTO = convertToReplyDTO(replyEntity);
			replyDTOList.add(replyDTO);
		}
		dto.setReplyList(replyDTOList);
		
		// dto 리턴
		return dto;
	}
		/**
		 * 
		 * @param board
		 * @return
		 */
		private BoardDTO convertDTO(BoardEntity board) {
			return BoardDTO.builder()
					.boardNum(board.getBoardNum())
					.memberId(board.getMemberId() != null ? board.getMemberId().getMemberId() : null)
					.memberName(board.getMemberId() != null ? board.getMemberId().getMemberName() : null)
					.title(board.getTitle())
					.contents(board.getContents())
					.viewCount(board.getViewCount())
					.likeCount(board.getLikeCount())
					.originalName(board.getOriginalName())
					.fileName(board.getFileName())
					.createDate(board.getCreateDate())
					.updateDate(board.getUpdateDate())
					.build();
			
		}

		/**
		 * ReplyEntity 객체를 ReplyDTO 객체로 변환
		 * @param replyEntity 	리플 정보 Entitiy 객체
		 * @return dto			리플 정보
		 */
			private ReplyDTO convertToReplyDTO(ReplyEntity entity) {
			return ReplyDTO.builder()
					.replyNum(entity.getReplyNum())
					.boardNum(entity.getReplyNum())
					.memberId(entity.getMember().getMemberId())
					.memberName(entity.getMember().getMemberName())
					.contents(entity.getContents())
					.createDate(entity.getCreateDate())
					.build();
		}
		
		/**
		 * 파일 다운로드
		 * @param boardNum 글번호
		 * @param response 응답정보(HTTP 응답으로 파일 전송)
		 * @param uploadPath 파일 저장 경로
		 */
		@Override
		public void download(Integer boardNum, HttpServletResponse response, String uploadPath) {
			
			// 전달된 글 번호로 글 정보 조회
			BoardEntity board = boardRepository.findById(boardNum)
					.orElseThrow(() -> 
					new EntityNotFoundException("해당 번호의 글이 없습니다."));
			
			/* 
			 * 파일 다운로드할 때, 클라이언트가 다운로드 대화상자에 표시할 파일 이름을
			 * 설정하기 위해 Content-Disposition 헤더를 설정
			 */
			try {
				/*
				 *  1. Content-Disposition 헤더
				 *  브라우저에게 응답에 포함된 컨텐츠를 어떻게 처리해야할 지 지시하는 HTTP 헤더
				 *  - "attachment;" : 해당 파일을 다운로드하도록 창을 띄움
				 *  - "filename=" : 다운로드 창에 표시될 파일 이름을 지정
				 *  
				 *  2. URLEncoder.encode()
				 *  - 문자열을 특정 인코딩 방식(UTF-8)을 사용해 URL 형식에 맞게 인코딩하는 메서드
				 *  파일 이름에 한글이나 공백, 특수문자가 포함되어 있을 경우, 일부 브라우저 및 
				 *  클라이언트에서 처리할 때 문제가 발생할 수 있으니 이 메서드를 통해 
				 *  파일 이름을 인코딩하여 브라우저에서 올바르게 처리할 수 있도록 해줌.
				 */
				response.setHeader("Content-Disposition", "attachment;filename=" 
			+ URLEncoder.encode(board.getOriginalName(), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			// 저장된 파일 경로
			String fullPath = uploadPath + "/" + board.getFileName();
			
			FileInputStream filein = null;
			ServletOutputStream fileout = null;
			
			try {
				filein = new FileInputStream(fullPath);
				fileout = response.getOutputStream();
				
				FileCopyUtils.copy(filein, fileout);
				
			}catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					filein.close();
					fileout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		/**
		 * 추천 수 처리
		 * @param boardNum 
		 */
		@Override
		public void likeplus(Integer boardNum) {
			// 전달된 글 번호로 글 정보 조회
			BoardEntity board = boardRepository.findById(boardNum)
					.orElseThrow(() -> 
					new EntityNotFoundException("해당 번호의 글이 없습니다."));
			
			board.setLikeCount(board.getLikeCount() + 1);
		}

		@Override
		public BoardDTO selectBoard(Integer boardNum) {
			// 전달된 글 번호로 글 정보 조회
			BoardEntity board = boardRepository.findById(boardNum)
					.orElseThrow(() -> 
					new EntityNotFoundException("해당 번호의 글이 없습니다."));
			
			BoardDTO dto = convertDTO(board);
			return dto;
		}

		@Override
		public void updateBoard(BoardDTO b, String user, String uploadPath, MultipartFile upload) throws Exception {
			BoardEntity board = boardRepository.findById(b.getBoardNum())
					.orElseThrow(() -> 
					new EntityNotFoundException("해당 번호의 글이 없습니다."));
			
			if (!board.getMemberId().getMemberId().equals(user)) {
				throw new RuntimeException("수정권한이 없습니다.");
			}
			// 전달된 정보 수정
			board.setTitle(b.getTitle());
			board.setContents(b.getContents());
			
		    // 첨부파일이 있는 경우 처리
		    if (upload != null && !upload.isEmpty()) {
		    	if(board.getFileName() != null) {
		    		fileManager.deleteFile(uploadPath, board.getFileName());
		    	}
		        String fileName = fileManager.saveFile(uploadPath, upload);		// 파일 저장 후 파일명 반환
			    board.setFileName(fileName);                                // 저장된 파일명 설정
			    board.setOriginalName(upload.getOriginalFilename());        // 원본 파일명 저장
		    } else {
		    	if (board.getFileName() != null) {
		    		fileManager.deleteFile(uploadPath, board.getFileName());
		    	}
		        board.setOriginalName(b.getOriginalName());
		        board.setFileName(b.getFileName());
		    }

			
		}

		/**
		 * 게시글 삭제
		 * @param boardNum 삭제할 글 번호
		 * @param uploadPath 첨부파일이 존재하는 디렉토리 경로
		 * @param user 로그인 중인 아이디
		 * @throws Exception 
		 */
		@Override
		public void deleteBoard(Integer boardNum, String uploadPath, String user) throws Exception {
			BoardEntity board = boardRepository.findById(boardNum)
					.orElseThrow(() -> 
					new EntityNotFoundException("해당 번호의 글이 없습니다."));
			
			if (!board.getMemberId().getMemberId().equals(user)) {
				throw new RuntimeException("삭제권한이 없습니다.");
			}
			if (board.getFileName() != null) {
				fileManager.deleteFile(uploadPath, board.getFileName());
			}
			boardRepository.delete(board);
		}

		/**
		 * 리플 저장
		 * @param replyDTO 작성한 리플 정보
		 * @throws EntityNotFoundException
		 */
		@Override
		public void replyWrite(ReplyDTO replyDTO) {
			// 회원 정보를 DB로부터 조회 및 가져오기
			MemberEntity member = memberRepository.findById(replyDTO.getMemberId())
					.orElseThrow(() -> 
			new EntityNotFoundException("해당 아이디가 없습니다."));
			// 글 정보를 DB로부터 조회 및 가져오기
			BoardEntity board = boardRepository.findById(replyDTO.getBoardNum())
					.orElseThrow(() -> 
			new EntityNotFoundException("해당 번호의 글이 없습니다."));
			
			// ReplyEntity에 위의 데이터 집어넣기
			ReplyEntity reply = ReplyEntity.builder()
					.board(board)
					.member(member)
					.contents(replyDTO.getContents())
					.build();
			
			// Jpa 메서드를 통해 DB에 저장하기
		    replyRepository.save(reply);
		}

		@Override
		public void replydelete(Integer replyNum, String user) {
			ReplyEntity reply = replyRepository.findById(replyNum)
					.orElseThrow(() -> 
					new EntityNotFoundException("해당 번호의 글이 없습니다."));
					
			if (!reply.getMember().getMemberId().equals(user)) {
				throw new RuntimeException("삭제권한이 없습니다.");
			}
			replyRepository.delete(reply);
		}

		/**
		 * (검색 후 지정한 페이지 분량의) 글 목록 조회
		 * @param page				현재 페이지
		 * @param pageSize			한 페이지당 글 수
		 * @param searchType		검색 대상, 기준
		 * @param searchWord		검색어
		 * @return 한 페이지의 글 목록	
		 */
		@Override
		public Page<BoardDTO> getList(int page, int pageSize, String searchType, String searchWord) {
			
			page--;
			
			/*
			 * Pageable : 페이징과 정렬을 위한 페이지 조회 조건을 정의하는 인터페이스
			 * 			  에이징 쿼리시 몇 번째 페이지를 조회할 것인지,
			 * 			  한 페이지에 몇 개의 항목을 포함할 것인지,
			 * 			  어떤 필드 기준으로 정렬할 것인지를 명시.
			 * 			  PageRequest.of()를 통해 Pageable 객체를 생성
			 * PageRequest : Pageable 인터페이스의 일반적인 구현체.
			 * 				 페이지 번호, 페이지 크기, 정렬 정보를 받아 페이징 처리
			 */
			
			// 페이지 조회 조건(현재 페이지, 페이지당 글 수, 정렬 기준 컬럼 및 정렬 순서
			Pageable pageable = PageRequest.of(page, pageSize, Sort.by("boardNum").descending());
			
			Page<BoardEntity> entityPage = null;
			
			switch (searchType) {
			case "title" :
				entityPage = boardRepository.findByTitleContaining(searchWord, pageable);
				break;
			case "contents" :
				entityPage = boardRepository.findByContentsContaining(searchWord, pageable);
				break;
			case "id" :
				entityPage = boardRepository.findByMemberId_MemberId(searchWord, pageable);
				break;
			case "all" :
				entityPage = boardRepository.findByTitleContainingOrContentsContainingOrMemberId_MemberIdContaining(searchWord, searchWord, searchWord, pageable);
				
//				entityPage = boardRepository.searchAll(searchWord, pageable);
				break;
				default : 
					entityPage = boardRepository.findAll(pageable);
					break;
			}
			
			List<BoardDTO> boardDTOList = new ArrayList<>();
			for(BoardEntity entity : entityPage) {
				// BoardEntity를 BoardDTO로 변환
				BoardDTO dto = convertDTO(entity);
				boardDTOList.add(dto);
			}
			
			// PageImpl 클래스는 Page 인터페이스의 구현체
			// 변환된 boardDTOList와 Pageable, 총 요소 수를 사용하여
			// 새로운 Page<BoardDTO> 객체를 생성
			Page<BoardDTO> boardDTOPage = new PageImpl<>(
					boardDTOList, entityPage.getPageable(),
					entityPage.getTotalElements());
					
			return boardDTOPage;
		}
		
}
