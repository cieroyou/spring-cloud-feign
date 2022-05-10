package com.sera.cloud.openfeign.service;

import com.sera.cloud.openfeign.model.Post;

import java.util.List;

public interface JSONPlaceHolderService {
    List<Post> getPosts();

    Post getPostbyId(Long id);
}
