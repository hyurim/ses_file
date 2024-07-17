package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// http://localhost:9991/ 경로로 요청이 들어왔을 때 실행될 메서드
	@GetMapping({"", "/"})
	public String home() {
		
		// templates 경로의 home.html 문서를 찾음
		return "home";
	}
}
