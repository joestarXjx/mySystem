package com.bjtu.usersys.service.impl;

import com.bjtu.usersys.entity.Post;
import com.bjtu.usersys.entity.PostReview;
import com.bjtu.usersys.entity.Test;
import com.bjtu.usersys.mapper.PostMapper;
import com.bjtu.usersys.mapper.TestMapper;
import com.bjtu.usersys.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostMapper postMapper;

    @Autowired
    TestMapper testMapper;

    @Override
    public List<Post> getAllPost() {
        return postMapper.getAllPost();
    }

    @Override
    public Post getPostById(int id) {
        return postMapper.getPostById(id);
    }

    @Override
    public List<PostReview> getReview(int pid) {
        return postMapper.getReview(pid);
    }

    @Override
    public List<Test> getAllT() {
        return testMapper.getAllT();
    }

}
