package com.dsa.web5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
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
import com.dsa.web5.dto.ReplyDTO;
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
	
    @Value("${page.size:10}")
    private int pageSize;

    @Value("${link.size:5}")
    private int linkSize;
	
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
	    * 게시판 전체 글 목록, 페이징 O
	    * @param model	
	    * @param page			현재 페이지(default: 1)
	    * @param searchType		검색 대상(default: "")
	    * @param searchWord		검색어(default: "")
	    */
	   
	   @GetMapping("list")
	   public String list(Model model,
			   @RequestParam(name="page", defaultValue="1") int page,
			   @RequestParam(name="searchType", defaultValue="") String searchType,
			   @RequestParam(name="searchWord", defaultValue="") String searchWord) {
		   log.debug("properties 값 : pagesize={}, linkSize={} uploadPath ={} ", pageSize, linkSize, uploadPath);
		   log.debug("요청 파라미터 : page = {}, searchType ={}, searchWord= {}", page, searchType, searchWord);
		   
		   // Page, Pageable : Spring Data JPA에서 페이징과 관련된 작업을
		   //					간편하게 처리하기 위한 클래스 및 인터페이스
		   // 현재 페이지, 페이지당 글 수, 검색 대상, 검색어
		   Page<BoardDTO> boardPage = boardService.getList(
				   page, pageSize, searchType, searchWord
				   );
		   
		   log.debug("목록 정보 getContent(): {}", boardPage.getContent());
		   log.debug("현재 페이지 getNumber(): {}", boardPage.getNumber());
		   log.debug("전체 개수 getTotalElement(): {}", boardPage.getTotalElements());
		   log.debug("전체 페이지 getTotalPage(): {}", boardPage.getTotalPages());
		   log.debug("한 페이지당 글 수 getSize(): {}", boardPage.getSize());
		   log.debug("이전 페이지 존재 여부 hasPrevious(): {}", boardPage.hasPrevious());
		   log.debug("다음 페이지 존재 여부 hasNext(): {}", boardPage.hasNext());
				   
		   
		   model.addAttribute("boardPage", boardPage);
		   model.addAttribute("page", page);
		   model.addAttribute("linkSize", linkSize);
		   model.addAttribute("searchType", searchType);
		   model.addAttribute("searchWord", searchWord);
		   
		   return "board/list";
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
	   
	   /**
	    * 게시글 수정처리
	    * @param user 로그인한 사용자 정보
	    * @param board
	    * @param upload 
	    * @return read.html
	    */
	   @PostMapping("update")
	   public String update( 
			   @AuthenticationPrincipal AuthenticatedUser user, 
		         @ModelAttribute BoardDTO board,
		         @RequestParam(name = "upload", required = false) MultipartFile upload) {
		   try {
			   boardService.updateBoard(board, user.getId(), uploadPath, upload);
			   return "redirect:read?boardNum=" + board.getBoardNum();
			   } catch (Exception e) {
				   e.printStackTrace();
				   return "redirect:listAll";
				   }
		   }
	   
	   /**
	    * 게시글 삭제
	    * @param boardNum	게시글 번호
	    * @param user		유저
	    * @return
	    */
	   @GetMapping("delete")
	   public String delete(
			   @RequestParam("boardNum") Integer boardNum, 
			   @AuthenticationPrincipal AuthenticatedUser user) {
		   try {
			   boardService.deleteBoard(boardNum, uploadPath, user.getId());
			   return "redirect:listAll";
			   } catch (Exception e) {
				   e.printStackTrace();
				   return "redirect:listAll";
				   }
		   }
	   
	   /**
	    * 리플 작성
	    * @param replyDTO	저장할 리플 정보
	    * @param user 로그인한 사용자 아이디
	    * @param model 
	    * @return read.html
	    */
	   @PostMapping("replyWrite")
	   public String replyWrite(@ModelAttribute ReplyDTO replyDTO
			   , @AuthenticationPrincipal AuthenticatedUser user,
			   Model model) {
	   	replyDTO.setMemberId(user.getUsername()); // 리플 작성자 정보 추가
	   	boardService.replyWrite(replyDTO);
	   	return "redirect:read?boardNum=" + replyDTO.getBoardNum();
	   }
	   
	   /**
	    * 리플 삭제
	    * @param replyNum 댓글 번호
	    * @param boardNum 게시글 번호
	    * @return read.html
	    */
	   @GetMapping("replyDelete")
	   public String replyDelete(
			   @RequestParam("replyNum") Integer replyNum
			   , @AuthenticationPrincipal AuthenticatedUser user
			   , @RequestParam("boardNum") Integer boardNum) {
		   try {
			   boardService.replydelete(replyNum, user.getId());
			   return "redirect:read?boardNum=" + boardNum;
			   } catch (Exception e) { // 문제 발생
				   e.printStackTrace();
				   return "redirect:listAll";
				   }
		   
	   }
	   
	   
}
