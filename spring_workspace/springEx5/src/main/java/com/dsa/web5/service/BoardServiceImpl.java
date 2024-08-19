package com.dsa.web5.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dsa.web5.dto.BoardDTO;
import com.dsa.web5.entity.BoardEntity;
import com.dsa.web5.entity.MemberEntity;
import com.dsa.web5.repository.BoardRepository;
import com.dsa.web5.repository.MemberRepository;
import com.dsa.web5.util.FileManager;

import jakarta.persistence.EntityNotFoundException;
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
