package com.bjtu.usersys.service.impl;

import com.bjtu.usersys.entity.Result;
import com.bjtu.usersys.entity.User;
import com.bjtu.usersys.mapper.UserMapper;
import com.bjtu.usersys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Result login(User user, HttpSession session) {
        String username=user.getUsername();
        username= HtmlUtils.htmlEscape(username);
        User u=userMapper.getUserByName(username);
        if (u.getPassword().equals(user.getPassword())){
            session.setAttribute("user",user);
            return new Result(200);  //登陆成功
        }
        return new Result(400); //登陆失败

    }
    @Override
    public Result register(User user) {
        if(userMapper.getUserByName(user.getUsername())==null){
            userMapper.addNewUser(user);
            return new Result(200); //注册成功
        }
        // 用户名已存在
        return new Result(400);
    }
}
