package com.bjtu.usersys.entity;

import lombok.Data;

@Data
public class PostReview {
    private int id;
    private int uid;
    private int pid;
    private String content;
    private String time;

    public PostReview(int id, int uid, int pid, String content, String time) {
        this.id = id;
        this.uid = uid;
        this.pid = pid;
        this.content = content;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
