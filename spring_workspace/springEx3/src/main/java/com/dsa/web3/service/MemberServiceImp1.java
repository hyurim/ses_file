package com.dsa.web3.service;

import org.springframework.stereotype.Service;

import com.dsa.web3.repository.MemberRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * 회원 정보 관련 처리를 하는 서비스 클래스
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImp1 implements MemberService{
	private final MemberRepository mr;
}
