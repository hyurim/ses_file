package com.dsa.web4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "info_search")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class MemberEntity {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// 데이터베이스가 기본 키 값을 자동으로 생성하고, JPA는 그 값을 데이터베이스로부터 가져오는 방식
    @Column(name = "no")
    private Long no;
	
	@Column(name = "id", nullable = false, length = 10, unique = true)
	private String id;
	
	@Column(name ="pw" , nullable = false, length = 20)
	private String pw;
	
	@Column(name = "name", nullable = false, length = 10)
	private String name;
	
	@Column(name = "phone", nullable = false, length = 11)
	private String phone;
	
	@Column(name = "address", nullable = false, length = 50)
	private String address;
}
