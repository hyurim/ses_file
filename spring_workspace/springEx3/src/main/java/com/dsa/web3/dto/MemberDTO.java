package com.dsa.web3.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 * 회원 정보를 저장하여 전달할 클래스
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String address;

}
