package com.sera.cloud.openfeign.service.impl;

import com.sera.cloud.openfeign.client.JSONPlaceHolderClient;
import com.sera.cloud.openfeign.model.Post;
import com.sera.cloud.openfeign.service.JSONPlaceHolderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JSONPlaceHolderServiceImpl implements JSONPlaceHolderService {

    private final JSONPlaceHolderClient jsonPlaceHolderClient;

    @Override
    public List<Post> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }

    @Override
    public Post getPostbyId(Long id) {
        return jsonPlaceHolderClient.getPostById(id);
    }
}
