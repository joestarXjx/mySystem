package com.bjtu.usersys.entity;

import lombok.Data;

import java.util.List;

@Data
public class Post {
    private int id;
    private String title;
    private String content;
    private String time;
    private int posterId;
    private String posterName;
    private List<PostReview> reviews;
}
