package com.dsa.web4.service;

import java.util.List;

import com.dsa.web4.dto.SearchDTO;

public interface SearchService {
	
	void insertSearch();
	
	SearchDTO selectData(String id);

	void updateData(SearchDTO s);

	boolean deleteData(String string);

	List<SearchDTO> selectAllData();
	
}
