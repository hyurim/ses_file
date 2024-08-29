package com.dsa.web5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsa.web5.entity.ScrapEntity;

@Repository
public interface ScrapRepository extends JpaRepository<ScrapEntity, Long> {
    
    // 특정 사용자와 게시글에 대한 스크랩 여부 확인
    boolean existsByUserIdAndPostId(String userId, Long postId);
}
