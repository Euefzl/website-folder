package com.news.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.news.entity.User;
import com.news.mapper.UserMapper;
import com.news.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User login(String username, String password) {
        // 不查数据库
        return null;
    }

    @Override
    public boolean register(User user) {
        return false;
    }
}