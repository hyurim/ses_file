package com.dsa.web5.service;

public interface ScrapService {
    
    /**
     * 게시글 스크랩
     * @param userId 사용자 ID
     * @param postId 게시글 ID
     */
    void scrapPost(String userId, Long postId);

    /**
     * 스크랩 삭제
     * @param userId 사용자 ID
     * @param postId 게시글 ID
     */
    void unsaveScrap(String userId, Long postId);
}
