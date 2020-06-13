package com.bjtu.usersys.entity;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String mail;
    private String sex;
    private String school;
    private String major;
    private String education;
    private String birth;
    private String description;
}
