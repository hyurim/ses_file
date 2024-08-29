package com.dsa.web5.service;

import com.dsa.web5.dto.MemberDTO;

public interface MemberService {

	boolean idCheck(String searchId);

	void join(MemberDTO member);

	MemberDTO getMember(String username);

	void update(MemberDTO memberDTO);

    /**
     * 이메일을 기반으로 아이디 찾기
     * @param email 이메일 주소
     * @return 아이디 (찾을 수 없을 경우 null 반환)
     */
   // String findIdByEmail(String email);

}
