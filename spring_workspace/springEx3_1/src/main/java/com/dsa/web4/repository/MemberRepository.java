package com.dsa.web4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsa.web4.entity.MemberEntity;

@Repository
// 인터페이스 또는 클래스가 데이터베이스 접근을 담당하는 리포지토리임을 명시적으로 나타냄
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
	// JpaRepository - CRUD 작업 및 페이징, 정렬 기능 제공
}
