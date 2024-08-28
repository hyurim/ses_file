package com.dsa.web6.entity;

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
//jpa에서 데이터베이스 테이블과 매핑되는 자바 클래스를 정의하기 위해 사용하는 어노테이션
@Entity
//엔티티가 매핑될 테이블 지정. 생략하면 클래스 이름이 테이블 이름으로 사용
@Table(name = "ajax_comment")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// 데이터베이스가 기본 키 값을 자동으로 생성하고, JPA는 그 값을 데이터베이스로부터 가져오는 방식
	// Primary key 생성 전략, MySQL의 AUTO_INCREMENT 방식을 이용
	@Column(name = "num")
	// 위 아래 이름이 다를 경우 @Column을 써야하지만 같을 경우에는 굳이 안써도 됨.
	private Integer num;
	
	@Column(name = "name", nullable = false, length = 30)
	private String name; // 작성자
	
	@Column(name = "comment", nullable = false, length = 1000)
	private String comment; // 작성자
}
