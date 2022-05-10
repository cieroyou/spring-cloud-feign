package com.sera.cloud.openfeign.controller;

import com.sera.cloud.openfeign.model.Post;
import com.sera.cloud.openfeign.service.JSONPlaceHolderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/jsonplaceholer")
public class JSONPlaceHolderController {
    private final JSONPlaceHolderService jsonPlaceHolderService;

    @GetMapping(value = "/posts")
    List<Post> getPosts() {
        return jsonPlaceHolderService.getPosts();
    }

    @GetMapping(value = "/posts/{postId}", produces = "application/json")
    Post getPostById(@PathVariable("postId") Long postId) {
        return jsonPlaceHolderService.getPostbyId(postId);
    }
}
