package com.bjtu.usersys.controller;

import com.bjtu.usersys.entity.Post;
import com.bjtu.usersys.entity.Test;
import com.bjtu.usersys.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @CrossOrigin
    @GetMapping("/api/posts")
    public List<Post> getAllPosts(){
        return postService.getAllPost();
    }


    @CrossOrigin
    @GetMapping("/api/posts/{id}")
    public Post getPost(@PathVariable int id){
        Post post=postService.getPostById(id);
        post.setReviews(postService.getReview(id));
        return post;
    }


    @CrossOrigin
    @GetMapping("/api/messages")
    public List<Test> getT(){
        return postService.getAllT();
    }

}
