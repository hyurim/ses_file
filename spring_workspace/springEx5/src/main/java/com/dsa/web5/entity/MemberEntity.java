package com.dsa.web5.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 회원 정보 Entity
 * Service <-> Repository
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "web5_member")
public class MemberEntity {
	@Id
	@Column(name = "member_id", length = 30)
	String memberId;
	
	@Column(name = "member_password", nullable = false, length = 100)
	String memberPassword;
	
	@Column(name = "member_name", nullable = false, length = 30)
	String memberName;
	
	@Column(name = "email", length = 50)
	String email;
	
	@Column(name = "phone", length = 30)
	String phone;
	
	@Column(name = "address", length = 200)
	String address;
	
	@Column(name = "enabled", columnDefinition = "tinyint(1) default 1 check(enabled in (0, 1))")
	Boolean enabled;
	
	@Column(name = "rolename", columnDefinition = "varchar(30) default 'ROLE_USER' check(" + "rolename in ('ROLE_USER', 'ROLE_ADMIN'))")
	String rolename;
	
	@PrePersist
	/*
	 * 엔티티가 데이터베이스에 처음 저장될 때 특정 작업을 자동으로 수행하기 위해 사용되는 강력한 도구입니다. 기본값을 설정하거나, 엔티티가 저장되기 전에 특정 검증 로직을 실행할 때 유용하게 사용할 수 있다.
	 * 엔티티 생성 -> 필드 값 설정 -> persist 호출 -> @PrePersist 호출 -> db 저장
	 * DB에 저장하기 전에 엔티티의 상태를 검증하고 수정할 수 있는 마지막 단계. 해당 메서드에서 필드 값을 변경하면 그 값이 그대로 db에 반영.
	 */
	public void prePersist() {
		if(enabled == null) this.enabled = true;
		if(rolename == null) this.rolename = "ROLE_USER";
	}
}
