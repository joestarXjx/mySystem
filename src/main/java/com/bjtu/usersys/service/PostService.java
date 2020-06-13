package com.bjtu.usersys.service;

import com.bjtu.usersys.entity.Post;
import com.bjtu.usersys.entity.PostReview;
import com.bjtu.usersys.entity.Test;


import java.util.List;

public interface PostService {
    List<Post> getAllPost();
    Post getPostById(int id);
    List<PostReview> getReview(int pid);

    List<Test> getAllT();
}
