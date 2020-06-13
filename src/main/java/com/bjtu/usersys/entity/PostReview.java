package com.bjtu.usersys.entity;

import lombok.Data;

@Data
public class PostReview {
    private int id;
    private int uid;
    private int pid;
    private String content;
    private String time;
}
