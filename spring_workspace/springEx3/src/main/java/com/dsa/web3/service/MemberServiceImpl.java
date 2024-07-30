package com.dsa.web3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dsa.web3.dto.MemberDTO;
import com.dsa.web3.entity.MemberEntity;
import com.dsa.web3.repository.MemberRepository;

import jakarta.persistence.EntityNotFoundException;
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
public class MemberServiceImpl implements MemberService{
	
	private final MemberRepository mr;
	
	/*
	 * 회원정보 생성 후 DB에 저장
	 * @param id : 조회할 아이디
	 * @Return MemberDTO : 조회 결과를 담은 객체
	 */
	@Override
	public void insertData() {
		
		// 일반적인 인스턴스 생성
//		MemberEntity m = new MemberEntity("aaa", "111", "홍길동", "010-1111-2222", "광주무역회관");
		
		// builder 사용
		MemberEntity m = MemberEntity.builder()
				.id("aaa")
				.pw("111")
				.name("홍길동")
				.phone("010-1111-2222")
				.address("광주무역회관")
				.build();
		
		// 생성한 객체 DB에 저장
		mr.save(m);
		log.debug("[service-save] memberEntity: {}", m);
	}


	// alt + shift + s, v
	@Override
	public MemberDTO selectData(String id) {
		MemberEntity member = mr.findById(id).orElse(null);
		if (member == null) return null;
		
		log.debug("[service-find] memberEntity : {} ", member);
		
		// MemberDTO
		MemberDTO memberDTO = MemberDTO.builder()
								.id(member.getId())
								.pw(member.getPw())
								.name(member.getName())
								.phone(member.getPhone())
								.address(member.getAddress())
								.build();
		return memberDTO;
	}

	
	/*
	 * 회원정보 수정
	 * @param MemberDTO 회원 정보를 담은 객체
	 */
	@Override
	public void updateData(MemberDTO m) {
		try {
			// DB 정보를 조회
			MemberEntity entity = mr.findById(m.getId()).orElseThrow(() -> new EntityNotFoundException("없는 ID"));
					
			// MemberDTO의 수정할 정보를 entity에 세팅
			entity.setPw(m.getPw());
			entity.setName(m.getName());
			entity.setPhone(m.getPhone());
			entity.setAddress(m.getAddress());
			//entity 저장
			mr.save(entity);
	        log.debug("업데이트 된 정보 : {}",entity);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
	}

	/*
	 * 회원정보 삭제
	 * @param id 삭제할 아이디
	 * @return 삭제여부 true/false
	 */
	@Override
	public boolean deleteData(String id) {	
		
		boolean result = mr.existsById(id);
		
		if (result)
			mr.deleteById(id);
		
		return false;
	}

	/*
	 * 모든 회원정보 보기
	 * @return 모든 정보를 담은 객체의 리스트
	 */
	@Override
	public List<MemberDTO> selectAllData() {
		
		List<MemberEntity> entityList = mr.findAll();
		List<MemberDTO> dtoList = new ArrayList<>();
		
		for (MemberEntity entity : entityList) {
			MemberDTO dto = new MemberDTO();
			dto.setId(entity.getId());
			dto.setPw(entity.getPw());
			dto.setName(entity.getName());
			dto.setPhone(entity.getPhone());
			dto.setAddress(entity.getAddress());
			dtoList.add(dto);
			
		}
		return dtoList;
	}
	
}
