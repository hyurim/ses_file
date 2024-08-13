package com.dsa.web5.service;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dsa.web5.dto.BoardDTO;
import com.dsa.web5.entity.BoardEntity;
import com.dsa.web5.entity.MemberEntity;
import com.dsa.web5.repository.BoardRepository;
import com.dsa.web5.repository.MemberRepository;
import com.dsa.web5.repository.ReplyRepository;
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

}
