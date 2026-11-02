package com.news.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.news.entity.User;

public interface UserService extends IService<User> {
    User login(String username, String password);
    boolean register(User user);
}