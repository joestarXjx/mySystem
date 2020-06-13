package com.bjtu.usersys.service;

import com.bjtu.usersys.entity.Result;
import com.bjtu.usersys.entity.User;

import javax.servlet.http.HttpSession;

public interface UserService {
    Result login(User user, HttpSession session);
    Result register(User user);
}
