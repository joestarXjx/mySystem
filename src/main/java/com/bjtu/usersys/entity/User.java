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

    public User(int userId, String name, String username, String password, String phone, String mail, String sex, String school, String major, String education, String birth, String description) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.mail = mail;
        this.sex = sex;
        this.school = school;
        this.major = major;
        this.education = education;
        this.birth = birth;
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
