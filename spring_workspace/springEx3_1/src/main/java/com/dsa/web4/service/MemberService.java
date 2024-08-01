package com.dsa.web4.service;

import java.util.List;

import com.dsa.web4.dto.MemberDTO;

public interface MemberService {
	void insertData();
	
	MemberDTO selectData(String id);

	void updateData(MemberDTO m);

	boolean deleteData(String string);

	List<MemberDTO> selectAllData();
}
