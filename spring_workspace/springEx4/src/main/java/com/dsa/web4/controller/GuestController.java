package com.dsa.web4.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dsa.web4.dto.GuestBookDTO;
import com.dsa.web4.service.GuestService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
@RequestMapping("guest")
@RequiredArgsConstructor
public class GuestController {
	
	private final GuestService gs;
	
	@GetMapping("write")
	public String writeForm() {
		return "writeForm";
	}
	

	@PostMapping("guestlist")
	public String writeForm(
	        @RequestParam(name = "id") String id,
	        @RequestParam(name = "pw") String pw,
	        @RequestParam(name = "message") String message,
	        HttpSession session
	        ) {
	    log.debug("ID: {}", id);
	    log.debug("Password: {}", pw);
	    log.debug("Message: {}", message);
	    
	    gs.insertData(id, pw, message);
	    return "redirect:/guest/guestlist";
	}
	
	
	@GetMapping("guestlist")
	public String guest(Model model) {
		List<GuestBookDTO> guest = gs.selectAllData();
		
		model.addAttribute("guest", guest);
		
		return "guestList";
	}
	
	@PostMapping("delete")
	public String guest(
			@RequestParam("num") String num, 
			@RequestParam("password") String password,
			RedirectAttributes redirectAttributes) {
		/*
		 * RedirectAttributes
		 * 리디렉션된 페이지에서 사용할 수 있는 데이터(예: 성공 또는 실패 메시지, 에러 메시지 등)를 전달할 수 있습니다.\
		 * 1. Flash Attribute - 디렉션된 요청에서 사용할 수 있는 일회성 데이터를 저장하는 데 사용. 디렉션된 페이지에서만 사용되며, 리디렉션이 완료되면 데이터는 삭제됨.
		 * 2. 목적지 페이지로 데이터 전달
		 */
		boolean isDeleted = gs.deleteData(num, password);
		
		if (isDeleted) {
			redirectAttributes.addFlashAttribute("successMessage", "삭제가 완료되었습니다.");
        } else {
            // 비밀번호가 일치하지 않으면 에러 메시지 설정
            redirectAttributes.addFlashAttribute("errorMessage", "비밀번호가 일치하지 않습니다.");
             // 에러 발생 시 원래 페이지로 리다이렉트
            }
		return "redirect:/guest/guestlist";
	}
}
