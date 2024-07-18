package com.dsa.web99.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCotroller {
	
	@GetMapping({"", "/"})
	public String main() {
		return "main";
	}
	
	@GetMapping("path111")
	public String image() {
		return "image111";
	}
	/*
	//멤버 변수
	String name;
	private int age;
	
	// 멤버 메서드
	public String methodA(int num) {
		num = 10;
		return "text";
	}
*/
}
