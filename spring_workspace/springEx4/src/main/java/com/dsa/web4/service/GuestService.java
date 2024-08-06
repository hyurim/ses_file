package com.dsa.web4.service;

import java.util.List;

import com.dsa.web4.dto.GuestBookDTO;
	
public interface GuestService {
	void insertData(String id, String pw, String message);
	
	boolean deleteData(String num, String password);
		
	List<GuestBookDTO> selectAllData();
		
}

