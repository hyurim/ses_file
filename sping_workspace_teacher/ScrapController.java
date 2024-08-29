package com.dsa.web5.controller;

import org.springframework.web.bind.annotation.*;

import com.dsa.web5.service.ScrapService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/scrap")
public class ScrapController {

    private final ScrapService scrapService;

    @PostMapping("/add")
    public String addScrap(@RequestParam String userId, @RequestParam Long postId) {
        try {
            scrapService.scrapPost(userId, postId);
            return "스크랩이 추가되었습니다.";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    @PostMapping("/remove")
    public String removeScrap(@RequestParam String userId, @RequestParam Long postId) {
        try {
            scrapService.unsaveScrap(userId, postId);
            return "스크랩이 삭제되었습니다.";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
