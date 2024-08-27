package com.dsa.web6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dsa.web6.repository.MemberRepository;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ExempleController {

	  private final MemberRepository mr;

	    // 생성자 주입을 사용하여 final 필드를 초기화
	    public ExempleController(MemberRepository mr) {
	        this.mr = mr;
	    }
	    
	@GetMapping("idDuplicate")
	public String idDuplicate() {
		return "example/idDuplicate";
	}
	
	@PostMapping("inputid")
	public String inputid(@RequestParam("id") String id) {
		
		boolean result = mr.existsById(id);
		
		if (result) {
            return "OK"; // 사용 가능한 ID일 경우 응답
        } else {
        	return "DUPLICATE"; // 사용 불가능한 ID일 경우 에러 응답
        }
		

	
}
