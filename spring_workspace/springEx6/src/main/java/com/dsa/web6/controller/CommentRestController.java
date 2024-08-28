package com.dsa.web6.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dsa.web6.dto.CommentDTO;
import com.dsa.web6.service.CommentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
@RequestMapping("comment")
// @Controller + @ResponseBody 합친 결과
// 클래스 내의 모든 메서드에 @ResponseBody 적용
@RestController
public class CommentRestController {
	
	private final CommentService service;
	
	/**
	 * 댓글 목록 조회
	 * @return 댓글 목록
	 */
	   @GetMapping("list")
	   public List<CommentDTO> list() {
		   List<CommentDTO> list = service.getList();
	       return list;
	   }
	   
	   /**
	    * 댓글 저장
	    * @param commentDTO 저장할 댓글	 정보
	    */
	   @PostMapping("input")
	   public void input(@ModelAttribute CommentDTO commentDTO
			   ) {
		   log.debug("저장할 댓글 정보: {}", commentDTO);
	   	service.input(commentDTO);
	   }
	   
	   /**
	    * 댓글 삭제
	    * @param num
	    */
	   @PostMapping("delete")
	   public void delete(@RequestParam("num") int num) {
		   service.delete(num);
	   	
	   }
	   
	   @PostMapping("update")
	   public void update(@ModelAttribute CommentDTO commentDTO) {
		   log.debug("수정할 댓글 정보: {}", commentDTO);
		   service.update(commentDTO);
	   }
	   
}