package com.dsa.web5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsa.web5.entity.MemberEntity;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, String> {
    // 이메일을 기반으로 회원 찾기
    // MemberEntity findByEmail(String email);
}
