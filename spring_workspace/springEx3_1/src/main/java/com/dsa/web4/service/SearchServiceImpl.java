package com.dsa.web4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dsa.web4.dto.SearchDTO;
import com.dsa.web4.repository.MemberRepository;
import com.dsa.web4.service.MemberServiceImpl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class SearchServiceImpl implements SearchService{
	@Override
	public void insertSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SearchDTO selectData(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateData(SearchDTO s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteData(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<SearchDTO> selectAllData() {
		// TODO Auto-generated method stub
		return null;
	}

}
