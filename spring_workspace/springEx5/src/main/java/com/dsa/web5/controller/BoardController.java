package com.dsa.web5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dsa.web5.dto.BoardDTO;
import com.dsa.web5.security.AuthenticatedUser;
import com.dsa.web5.service.BoardService;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {
	// final이 붙어야 RequireArgsContructor가 작동
	private final BoardService boardService;
	
	// application.properties 파일의 게시판 관련 설정값 board.uploadPath 값이 경로가 됨.
	@Value("${board.uploadPath}") 
	String uploadPath;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("write")
	public String write() {
		return "board/writeForm";
	}
	
	/**
	 * 글 저장
	 * @param board 작성한 글 정보
	 * @param user 로그인한 사용자 정보
	 * @param MultipartFile 첨부파일
	 * @return listAll.html
	 */
	   @PostMapping("write")
	   public String write(
	         @ModelAttribute BoardDTO boardDTO,
	         @RequestParam(name = "upload", required = false) MultipartFile upload,
	         @AuthenticationPrincipal AuthenticatedUser user
	         ) {
	      
	      boardDTO.setMemberId(user.getUsername());
	      log.debug("저장할 첨부파일 정보: {}", upload.getOriginalFilename());
	      log.debug("저장할 글 정보: {}", boardDTO);
	      
	      try {
	         boardService.write(boardDTO, uploadPath, upload);
	         return "redirect:/board/listAll";
	      } catch(Exception e) {
	         e.printStackTrace();
	         return "board/writeForm";
	      }
	   }
	/**
	 * 게시글 전체 글 목록, 페이징X
	 * @param model
	 * @return listAll.html
	 */
	   @GetMapping("listAll")
	   public String listAll(Model model) {
		   
		   List<BoardDTO> board = boardService.selectAllData();
		   
		   model.addAttribute("board", board);
		   
	   	return "board/listAll";
	   }
	   
	   /**
	    * 게시글 상세보기
	    * @param Model
	    * @param boardNum 조회할 글 번호
	    * @retusn read.html
	    */
	   @GetMapping("read")
	   public String read(Model model, @RequestParam(name = "boardNum", defaultValue = "0") int boardNum) {
		   log.debug("boardNum: {} ", boardNum);
		   try {
			   BoardDTO boardDTO = boardService.getBoard(boardNum);
			   model.addAttribute("board", boardDTO);
		         return "board/read";
		         
		      } catch(Exception e) {
		         e.printStackTrace();
		         return "board/listAll";
		      }
	   }
	   
	   /**
	    * 첨부파일 다운로드
	    * @param boardNum 글번호
	    * @return response 응답 정보
	    */
	   @GetMapping("download")
	   public void download(@RequestParam("boardNum") Integer boardNum, HttpServletResponse response) {
		   log.debug("download 실행");
	   	boardService.download(boardNum, response, uploadPath);
	   }
	   
	   /**
	    * 추천 수 증가
	    * @param boardNum
	    * @return
	    */
	   @GetMapping("like")
	   public String like(@RequestParam("boardNum") Integer boardNum) {
		   System.out.println("Received boardNum: " + boardNum);
		   try {
		   boardService.likeplus(boardNum);
		   	return "redirect:read?boardNum=" + boardNum;
		   } catch (Exception e) {
			   return "redirect:listAll";
			   }
		   }
	   /**
	    * 게시글 수정 폼으로 이동
	    * @param boardNum 수정할 글 번호
	    * @param user 로그인한 사용자 정보
	    * @param model
	    * @return updateForm.html
	    */
	   @GetMapping("update")
	   public String update(@RequestParam("boardNum") Integer boardNum, 
			   @AuthenticationPrincipal AuthenticatedUser user, 
			   Model model) {
		   try {
			   BoardDTO boardDTO = boardService.selectBoard(boardNum);
			   if(!user.getUsername().equals(boardDTO.getMemberId())) {
				   throw new RuntimeException("수정권한이 없습니다.");
			   }
			   model.addAttribute("board", boardDTO);
		   	return "board/updateForm";
		   } catch (Exception e) {
			   e.printStackTrace();
			   return "redirect:listAll";
			   }
		   }
	   
	   @PostMapping("update")
	   public String update(@RequestParam("boardNum") Integer boardNum, 
		         @ModelAttribute BoardDTO board,
		         @RequestParam(name = "upload", required = false) MultipartFile upload) {
		   boardService.updateBoard(board, uploadPath, upload);
		   return "redirect:read?boardNum=" + boardNum;
	   }
	   
}
