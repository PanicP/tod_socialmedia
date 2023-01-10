package com.example.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.type.DeletePostResponse;
import com.example.type.Post;

@RestController
public class PostController {
    @GetMapping("/user/{userId}/post/{postId}")
    public Post getPost(
            @PathVariable("userId") String userId,
            @PathVariable("postId") String postId) {
        return new Post(UUID.fromString(userId), UUID.fromString(postId), System.currentTimeMillis(),
                System.currentTimeMillis(), 0, "content");
    }

    @PostMapping("/user/{userId}/post/{postId}")
    public Post postPost(
            @PathVariable("userId") String userId,
            @PathVariable("postId") String postId
    // @RequestParam Post PostReq
    ) {

        return new Post(UUID.fromString(userId), UUID.fromString(postId), System.currentTimeMillis(),
                System.currentTimeMillis(), 0, "content");
    }

    @PutMapping("/user/{userId}/post/{postId}")
    public Post putPost(
            @PathVariable("userId") String userId,
            @PathVariable("postId") String postId
    // @RequestParam Post PostReq
    ) {
        return new Post(UUID.fromString(userId), UUID.fromString(postId), System.currentTimeMillis(),
                System.currentTimeMillis(), 0, "content");
    }

    @DeleteMapping("/user/{userId}/post/{postId}")
    public DeletePostResponse deletePost(
            @PathVariable("userId") String userId,
            @PathVariable("postId") String postId) {
        return new DeletePostResponse(UUID.fromString(userId));
    }
}
