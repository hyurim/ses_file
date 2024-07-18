package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	   @GetMapping({"", "/"})
	   public String home() {
	      
	      // templates 경로의 home.html 문서를 찾음
	      return "home";
	   }
	   
	   @GetMapping("test")
	   public String test() {
		   return "test";
	   }
}
