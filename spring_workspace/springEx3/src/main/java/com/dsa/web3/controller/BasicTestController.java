package com.dsa.web3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

import com.dsa.web3.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("basic")
// final로 선언된 모든 멤버변수를 초기화 하는 생성자를 자동으로 생성
@RequiredArgsConstructor
public class BasicTestController {
	
	// 1. 필드 주입
//	@Autowired
//	MemberService ms;
	
	// 2. 생성자 주입
//	private MemberService ms;
//	@Autowired
//	public BasicTestController(MerberService ms) {
//		this.ms = ms;
//	}
	
	// 3. 명시적 생성자 사용
	private final MemberService ms;
	
}
