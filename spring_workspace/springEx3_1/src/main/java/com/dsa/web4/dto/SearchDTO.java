package com.dsa.web4.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
/**
 * 검색 정보를 저장하여 전달할 클랳스
 */
public class SearchDTO {
	private String no;
	private String id;
	private String search;
}
