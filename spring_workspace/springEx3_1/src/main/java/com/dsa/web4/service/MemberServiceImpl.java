package com.dsa.web4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dsa.web4.dto.MemberDTO;
import com.dsa.web4.entity.MemberEntity;
import com.dsa.web4.repository.MemberRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {
	
	private final MemberRepository mr;

	@Override
	public void insertData() {
		
//		MemberEntity m = MemberEntity.builder()
		
	}

	@Override
	public MemberDTO selectData(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateData(MemberDTO m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteData(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MemberDTO> selectAllData() {
		// TODO Auto-generated method stub
		return null;
	}
}
