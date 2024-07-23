package com.dsa.web2.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("session")
public class SessionController {
	
	@GetMapping("session1")
	public String session(HttpSession session) {
		// session 정보 저장 (key, value)
		session.setAttribute("name", "abc");
		return "redirect:/";
	}
	
	// 삭제
	@GetMapping("session2")
	public String session2(HttpSession session) {
		session.removeAttribute("name");
		return "redirect:/";
	}
	// 읽기
	@GetMapping("session3")
	public String session3(HttpSession session) {
		String name = (String) session.getAttribute("name");
		log.debug("session 정보: {}", name);
		return "redirect:/";
	}
	
	/*
	 * 로그인, 로그아웃 처리
	 */
	
	// 로그인 페이지로 이동
	@GetMapping("login")
	public String login() {
		return "ssView/login";
	}
	
	// 로그인 처리
	@PostMapping("login")
	public String loginProcess(
			@RequestParam(name = "id") String id,
			@RequestParam(name = "password") String password,
			HttpSession session
			) {
		log.debug("로그인 폼에서 작성한 입력값: id={}, pw={}", id, password);
		
		// 아이디가 abc이고, 비밀번호가 123이면 로그인이 되었다 가정하고
		// session 객체에 loginId 라는 이름으로 저장
		// home 페이지로 이동
		// abc & 123이 아니면 "로그인 되지 않았습니다" 라고 로그를 출력하고
		// 로그인 페이지로 이동
		
//		String a = "안녕";
//		String b = "안녕";
//		String c = new String("안녕");
//		System.out.println(a == b);
//		System.out.println(a == c);
//		System.out.println(a.equals(c));
		
		if (id.equals("abc") && password.equals("123")) {
			session.setAttribute("loginId", id);
//			session.setAttribute("loginPassword", password);
			return "redirect:/";
		} else {
			log.debug("로그인 되지 않았습니다.", id, password);
			return "ssView/login";
		}
		
	}
	
	// 로그아웃 처리
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("loginId");
		return "redirect:/";
	}
	
	// 로그인 확인 페이지
	@GetMapping("loginTest")
	public String loginTest(HttpSession session) {
		
		String id = (String) session.getAttribute("loginId");
		if (id == null || !id.equals("abc")) {
			log.debug("저장되지 않았거나 일치하지 않습니다.");
			return "redirect:/";
		}
		return "ssView/loginTest";
	}
}
