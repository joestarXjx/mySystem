package com.bjtu.usersys.entity;

import lombok.Data;

@Data
public class Book {
    private int bookId;
    private String cover;
    private String title;
    private String author;
    private String date;
    private String press;
    private String abouts;
    private int bookCategoryId;
    public Book(int bookId, String cover, String title, String author, String date, String press, String abouts, int bookCategoryId) {
        this.bookId = bookId;
        this.cover = cover;
        this.title = title;
        this.author = author;
        this.date = date;
        this.press = press;
        this.abouts = abouts;
        this.bookCategoryId = bookCategoryId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAbouts() {
        return abouts;
    }

    public void setAbouts(String abouts) {
        this.abouts = abouts;
    }

    public int getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(int bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }
}
