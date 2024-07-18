package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// http://localhost:9991/web1 경로로 요청이 들어왔을 때 실행될 메서드
	@GetMapping({"", "/"})
	public String home() {
		
		// templates 경로의 home.html 문서를 찾음
		return "home";
	}
	
	@GetMapping("image")
	public String image() {
		System.out.println("이미지 경로로 들어와서 image.html로 연결");
		return "image";
	}
	
	@GetMapping("sub/image2")
	public String image2() {
		return "image2"; 
	}
	@GetMapping("css")
	public String css() {
		return "css";
	}
	@GetMapping("js")
	public String js() {
		return "javascript/js";
		// templates가 기본 경로 시작. templates.~~ 면 "~~/파일명.html"으로 해야 찾을 수 있음.
	}
}
