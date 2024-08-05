package com.dsa.web4.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dsa.web4.dto.GuestBookDTO;
import com.dsa.web4.entity.GuestBookEntity;
import com.dsa.web4.repository.GuestBookRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class GuestServiceImpl implements GuestService {
	
	private final GuestBookRepository gr;

	@Override
	public void insertData(String id, String pw, String message) {
		GuestBookEntity g = GuestBookEntity.builder()
				.name(id)
				.password(pw)
				.message(message)
				.build();
		
		gr.save(g);
	}
	
	@Override
	public boolean deleteData(String num) {
		
		boolean result = gr.existsById(Integer.parseInt(num));
		
		if(result) {
			gr.deleteById(Integer.parseInt(num));
		}
		return false;
		
	}
	
	@Override
	public List<GuestBookDTO> selectAllData() {
		
		List<GuestBookEntity> entityList = gr.findAll();
		List<GuestBookDTO> dtoList = new ArrayList<>();
		
		for (GuestBookEntity entity : entityList ) {
			GuestBookDTO dto = new GuestBookDTO();
			dto.setNum(entity.getNum());
			dto.setName(entity.getName());
			dto.setPassword(entity.getPassword());
			dto.setMessage(entity.getMessage());
			dto.setInputdate(entity.getInputdate());
			dtoList.add(dto);
		}
		
		return dtoList;
		
	}
}
