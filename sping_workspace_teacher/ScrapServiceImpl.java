package com.dsa.web5.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsa.web5.entity.ScrapEntity;
import com.dsa.web5.repository.ScrapRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ScrapServiceImpl implements ScrapService {

    private final ScrapRepository scrapRepository;

    @Override
    @Transactional
    public void scrapPost(String userId, Long postId) {
        if (!scrapRepository.existsByUserIdAndPostId(userId, postId)) {
            ScrapEntity scrap = ScrapEntity.builder()
                    .userId(userId)
                    .postId(postId)
                    .createdAt(LocalDateTime.now())
                    .build();
            scrapRepository.save(scrap);
        } else {
            throw new IllegalArgumentException("이미 스크랩된 게시글입니다.");
        }
    }

    @Override
    @Transactional
    public void unsaveScrap(String userId, Long postId) {
        ScrapEntity scrap = scrapRepository.findByUserIdAndPostId(userId, postId);
        if (scrap != null) {
            scrapRepository.delete(scrap);
        } else {
            throw new IllegalArgumentException("스크랩이 존재하지 않습니다.");
        }
    }
}
