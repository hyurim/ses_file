package com.dsa.web2.HomeController;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("ex")
public class exController {

	@GetMapping("info")
	public String info() {
		return "ex/info";
	}
	
	@GetMapping("output")
	public String output(
			@RequestParam(name = "name") String name,
			@RequestParam(name = "ssn") String ssn,
			Model output
			) {
		log.debug("log : name={}, ssn={}", name, ssn);
		//info.html에서 입력받은 데이터를 파라미터로 받아오기
		// 주민번호의 각 자리별 정보를 통해 나이, 생년월일, 성별을 추출
		// model을 통해 output.html에 이름, 나이, 생년월일, 성별을 전송
		char gender = ssn.charAt(7);
		String genderResult = (gender == '1' || gender == '3') ? "남자" : "여자";
		int year = Integer.parseInt(ssn.substring(0,2));
		int month = Integer.parseInt(ssn.substring(2,4));
		int day = Integer.parseInt(ssn.substring(4,6));
		
		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR);
		
		int age;
		age = (gender == '1' || gender == '2') ? y - year -1900 : y - year - 2000;
		String birth = String.format("%d년 %d월 %d일", year, month, day);
		
		output.addAttribute("name", name);
		output.addAttribute("age", age);
		output.addAttribute("birth", birth);
		output.addAttribute("gender", genderResult);
		
		return "ex/output";
	}
	
	/*
	 * Cookie 객체를 이용한 방문 횟 수 count 예제
	 */
	@GetMapping("count")
	public String count(HttpServletResponse response,
			@CookieValue(name = "num", defaultValue = "0") int num,
			Model model
			) {

		// 카운트 증가
		num++;
		
		//  쿠키 객체 생성
		Cookie c1 = new Cookie("num", String.valueOf(num));
		// Interger.toString(num);
		
		// 유효 기간 하루
		c1.setMaxAge(60*60*24);
		
		// 쿠키 객체를 응답에 추가 
		response.addCookie(c1);
		
		// html로 보내주기
		model.addAttribute("num", num);
		
		
		return "ex/count";
	}
	
}
