package com.dsa.web6.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dsa.web6.dto.CommentDTO;
import com.dsa.web6.entity.CommentEntity;
import com.dsa.web6.repository.CommentRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional // < 이 부분 알아볼 것
@RequiredArgsConstructor
public class CommentService {
	
	private final CommentRepository commentRepository;
	/**
	 * 댓글 목록 조회
	 * @return 댓글 목록
	 */
	public List<CommentDTO> getList() {
		List<CommentEntity> entityList = commentRepository.findAll();
		List<CommentDTO> dtoList = new ArrayList<>();
		
		for (CommentEntity entity : entityList) {
			CommentDTO dto = CommentDTO.builder()
					  .num(entity.getNum())
					  .name(entity.getName())
					  .comment(entity.getComment())
					  .build();
			dtoList.add(dto);
//			log.debug("getCommentList-service: {}", dto);
		}
		
		return dtoList;
	}
	
	/**
	 * 댓글 저장
	 * @param dto 저장할 댓글 정보
	 */
	public void input(CommentDTO dto) {
//		CommentEntity commentEntity = commentRepository.findById(dto.getNum()).orElseThrow(() -> new EntityNotFoundException("해당 댓글이 존재합니다."));
		CommentEntity entity = new CommentEntity();
		entity.setName(dto.getName());
		entity.setComment(dto.getComment());
		
		commentRepository.save(entity);
	}

	/**
	 * 댓글 삭제
	 * @param num
	 */
	public void delete(int num) {
		commentRepository.deleteById(num);
		
	}

	/**
	 * 댓글 수정
	 * @param commentDTO 수정할 댓글 내용
	 */
	public void update(CommentDTO commentDTO) {
		CommentEntity entity = commentRepository.findById(commentDTO.getNum()).orElseThrow(() -> new EntityNotFoundException("수정할 댓글이 없습니다."));
		entity.setComment(commentDTO.getComment());
	}
	
}
