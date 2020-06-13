package com.bjtu.usersys.controller;

import com.bjtu.usersys.entity.Result;
import com.bjtu.usersys.entity.User;
import com.bjtu.usersys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User user, HttpSession session){
        return userService.login(user,session);
    }
}
