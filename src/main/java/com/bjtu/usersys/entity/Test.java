package com.bjtu.usersys.entity;

import lombok.Data;

@Data
public class Test {
    private int id;
    private String name;
    private String address;
    private String belong;

    public Test(int id, String name, String address, String belong) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.belong = belong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }
}
