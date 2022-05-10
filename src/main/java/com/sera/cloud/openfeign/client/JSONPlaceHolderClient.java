package com.sera.cloud.openfeign.client;

import com.sera.cloud.openfeign.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface JSONPlaceHolderClient {

    @GetMapping(value = "/posts")
    List<Post> getPosts();

    @GetMapping(value = "/posts/{postId}", produces = "application/json")
    Post getPostById(@PathVariable("postId") Long postId);
}
