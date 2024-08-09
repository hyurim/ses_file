package com.dsa.web5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dsa.web5.dto.MemberDTO;
import com.dsa.web5.service.MemberService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService ms;
	
	/**
	 * 요청시 회원가입 페이지로 이동
	 * @return joinForm.html
	 */
	@GetMapping("join")
	public String join() {
		return "member/joinForm";
	}
	
	/**
	 * 회원가입 페이지에서 "ID중복확인" 버튼을 클릭하면 새창으로 보여줄 검색 페이지 이동
	 * @return idCheck.html
	 */
	@GetMapping("idCheck")
	public String idCheck() {
		return "member/idCheck";
	}
	
	/**
	 * ID 중복 확인 페이지에서 검색 요청했을 때 처리
	 * @param searchId 검색할 아이디
	 * @return idCheck.html
	 */
	@PostMapping("idCheck")
	public String idCheck(@RequestParam("searchId") String searchId, Model model) {		
		
		boolean result = ms.idCheck(searchId);
		
		model.addAttribute("result", result);
		model.addAttribute("searchId", searchId);
		
		return "member/idCheck";
	}
	
	@PostMapping("join")
	public String join(@ModelAttribute MemberDTO member, HttpSession session) {
		log.debug("전달된 회원가입 정보 : {} ", member);
		ms.insertData(member);
		
		return "redirect:/";
	}
	
	/**
	 * 로그인 페이지로 이동
	 * @return loginForm.html
	 */
	@GetMapping("loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	
}
