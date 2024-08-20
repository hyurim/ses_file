package com.dsa.web5.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.dsa.web5.dto.BoardDTO;
import com.dsa.web5.entity.BoardEntity;
import com.dsa.web5.entity.MemberEntity;
import com.dsa.web5.repository.BoardRepository;
import com.dsa.web5.repository.MemberRepository;
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

		BoardDTO dto = convertDTO(board);
		
		// dto 리턴
		return dto;
	}
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

		@Override
		public void likeplus(Integer boardNum) {
			// 전달된 글 번호로 글 정보 조회
			BoardEntity board = boardRepository.findById(boardNum)
					.orElseThrow(() -> 
					new EntityNotFoundException("해당 번호의 글이 없습니다."));
			
			board.setLikeCount(board.getLikeCount() + 1);
//			boardRepository.save(board);
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
		public void updateBoard(BoardDTO b, String uploadPath, MultipartFile upload) {
			BoardEntity board = boardRepository.findById(b.getBoardNum())
					.orElseThrow(() -> 
					new EntityNotFoundException("해당 번호의 글이 없습니다."));
			
			board.setTitle(b.getTitle());
			board.setContents(b.getContents());
			
		    // 첨부파일이 있는 경우 처리
		    if (upload != null && !upload.isEmpty()) {
		        String fileName = fileManager.saveFile(uploadPath, upload);  // 파일 저장 후 파일명 반환
		        board.setFileName(fileName);                                // 저장된 파일명 설정
		        board.setOriginalName(upload.getOriginalFilename());        // 원본 파일명 저장
		    } else if (b.getOriginalName() != null) {
		        // 파일 첨부가 없는 경우 원본 파일명을 유지
		        board.setOriginalName(b.getOriginalName());
		        board.setFileName(b.getFileName());
		    }
		    
			System.out.println("수정된 내용5");
			System.out.println(board);
			System.out.println(b);
			System.out.println(upload);
			System.out.println(uploadPath);
			
			
		}
		
		
		// 존재한다면 entity의 정보를 dto에 옮겨닮기
		/*BoardDTO boardDto = BoardDTO.builder()
				.boardNum(board.getBoardNum())
				.memberId(board.getMemberId().getMemberId())
				.memberName(board.getMemberId().getMemberName())
				.title(board.getTitle())
				.contents(board.getContents())
				.viewCount(board.getViewCount())
				.likeCount(board.getLikeCount())
				.originalName(board.getOriginalName())
				.fileName(board.getFileName())
				.createDate(board.getCreateDate())
				.updateDate(board.getUpdateDate())
				.build();
		
		return boardDto;
	}
		*/
	/*
	@Override
	public List<BoardDTO> selectAllData2() {
		
		// stream()
		// 데이터 -> 중간 필터 -> 최종본
		 
	    return boardRepository.findAll().stream()
	        .map(entity -> {
	            BoardDTO dto = new BoardDTO();
	            dto.setBoardNum(entity.getBoardNum());
	            dto.setTitle(entity.getTitle());
	            // MemberEntity에서 이름을 가져와서 설정
	            dto.setMemberName(entity.getMemberId().getMemberName());
	            dto.setViewCount(entity.getViewCount());
	            dto.setCreateDate(entity.getCreateDate());
	            return dto;
	        })
	        .collect(Collectors.toList());
	}
	
	@Override
	public List<BoardDTO> selectAllData3() {

		List<BoardEntity> entityList = boardRepository.findAll();
		List<BoardDTO> dtoList = new ArrayList<>();
		
		for(BoardEntity entity : entityList) {
			BoardDTO dto = new BoardDTO();
			dto.setBoardNum(entity.getBoardNum());
			dto.setTitle(entity.getTitle());
			// MemberEntity에서 이름을 가져와서 설정
	        dto.setMemberName(entity.getMemberId().getMemberName());
			dto.setViewCount(entity.getViewCount());
			dto.setCreateDate(entity.getCreateDate());
			dtoList.add(dto);
		}
		return dtoList;
	}
	*/
}
