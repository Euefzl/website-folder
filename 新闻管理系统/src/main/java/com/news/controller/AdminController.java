package com.news.controller;

import com.news.entity.AdminUser;
import com.news.service.AdminUserService;
import com.news.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")

public class AdminController {

    @Autowired
    private AdminUserService adminUserService;

    @PostMapping("/login")

    public Result login(@RequestParam String username, @RequestParam String password) {
        AdminUser user = adminUserService.login(username, password);
        if (user != null) {
            // 这里可以生成JWT令牌，先简化返回用户信息
            return Result.success(user);
        } else {
            return Result.error("账号或密码错误");
        }
    }
}