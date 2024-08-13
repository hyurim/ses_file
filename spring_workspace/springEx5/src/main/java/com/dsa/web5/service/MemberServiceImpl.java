package com.dsa.web5.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dsa.web5.dto.MemberDTO;
import com.dsa.web5.entity.MemberEntity;
import com.dsa.web5.repository.MemberRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	
	private final MemberRepository mr;
	
	
	// 암호화
	private final BCryptPasswordEncoder passwordEncoder;
	/**
	 * 가입시 아이디 중복 확인 처리
	 * @param searchId
	 * @return 해당 아이디로 가입 가능 여부 true / false
	 */
	@Override
	public boolean idCheck(String searchId) {
		return !mr.existsById(searchId);
	}

	/**
	 * 회원가입 처리
	 * @param MemberDTO 가입 데이터
	 */
	@Override
	public void insertData(MemberDTO member) {

	    // 비밀번호 암호화
		String encodedPassword = passwordEncoder.encode(member.getMemberPassword());
		
		
		MemberEntity entity = MemberEntity.builder()
				.memberId(member.getMemberId())
				.memberName(member.getMemberName())
				.memberPassword(encodedPassword)
				.email(member.getEmail())
				.phone(member.getPhone())
				.address(member.getAddress())
				.build();
		
		mr.save(entity);
		
	}

	@Override
	public MemberDTO selectData(String id) {
		
		MemberEntity member = mr.findById(id).orElse(null);
		if(member == null) return null;
		
		String encodedPassword = passwordEncoder.encode(member.getMemberPassword());
		
		MemberDTO memberDTO = MemberDTO.builder()
				.memberId(member.getMemberId())
				.memberName(member.getMemberName())
				.memberPassword(encodedPassword)
				.email(member.getEmail())
				.phone(member.getPhone())
				.address(member.getAddress())
				.build();
		
		
		return memberDTO;
	}

	@Override
	public void updateData(MemberDTO member) {
		try {
			MemberEntity entity = mr.findById(member.getMemberId()).orElseThrow(() -> new EntityNotFoundException("없는 ID"));
			String encodedPassword = passwordEncoder.encode(member.getMemberPassword());
			
			entity.setMemberPassword(encodedPassword);
			entity.setMemberName(member.getMemberName());
			entity.setAddress(member.getAddress());
			entity.setEmail(member.getEmail());
			entity.setPhone(member.getPhone());
			
			mr.save(entity);
	        log.debug("업데이트 된 정보 : {}",entity);
	        
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
	}
}
