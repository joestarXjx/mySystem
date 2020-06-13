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
}
