package com.news.controller;

import com.news.entity.Result;
import com.news.entity.User;
import com.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 登录：不连数据库，直接验证
    @PostMapping("/login")
    public Result login(@RequestBody User user, HttpSession session) {
        if ("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
            session.setAttribute("user", user);
            return Result.success("登录成功");
        }
        return Result.error("账号或密码错误");
    }

    // 注册：直接返回成功
    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        return Result.success("注册成功");
    }
}