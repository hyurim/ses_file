package com.dsa.web4.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
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
@Table(name = "guestbook13")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class GuestBookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// 데이터베이스가 기본 키 값을 자동으로 생성하고, JPA는 그 값을 데이터베이스로부터 가져오는 방식
	// Primary key 생성 전략, MySQL의 AUTO_INCREMENT 방식을 이용
	@Column(name = "num")
	private Integer num;
	
	@Column(name = "name", nullable = false, length = 100)
	private String name; // 작성자
	
	@Column(name = "password", nullable = false, length = 100)
	private String password; // 비밀번호
	
	@Column(name = "message", nullable = false, columnDefinition = "text")
	private String message; // 게시글
	
	@CreatedDate
	// Entity가 생성된 날짜와 시간을 자동으로 저장하기 위해 사용 (생성시 한 번만 설정된다. 추후 업데이트 X)
	// 수정시간은 기록되지 않으며, 수정 시간을 추가하고 싶을 때는 @LastModifiedDate 라는 어노테이션을 사용해야함. (수정할 때마다 업데이트 된다.)
	// LocalDateTime, LocalDate, Date 타입의 필드와 함께 사용
	@Column(name = "inputdate")
	private LocalDateTime inputdate; // 작성시간
	

}
