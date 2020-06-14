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

    public Post(int id, String title, String content, String time, int posterId, String posterName, List<PostReview> reviews) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
        this.posterId = posterId;
        this.posterName = posterName;
        this.reviews = reviews;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    public List<PostReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<PostReview> reviews) {
        this.reviews = reviews;
    }
}
