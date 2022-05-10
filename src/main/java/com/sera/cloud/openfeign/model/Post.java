package com.sera.cloud.openfeign.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private String userId;
    private Long id;
    private String title;
    private String body;
}
