package com.dsa.web4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "search")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class SearchEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private Long no;
	
	@ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    private MemberEntity memberId;
	// @ManyToOne
	// 엔티티 간의 다대일(Many-to-One) 관계를 정의
	// SearchEntity 인스턴스가 하나의 MemberEntity 인스턴스에 연결될 수 있음
	// @JoinColumn
	// 외래 키 컬럼을 매핑하는 데 사용
	
	@Column(name = "search", nullable = false, length = 100)
	private String search;
}
