package com.dsa.web6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsa.web6.repository.MemberRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional

public class AjaxService {
	@Autowired
	MemberRepository memberRepository;

	public boolean idDuplicate(String id) {
		return memberRepository.existsById(id);
	}
}


