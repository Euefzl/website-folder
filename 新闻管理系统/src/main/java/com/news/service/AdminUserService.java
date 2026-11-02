package com.news.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.news.entity.AdminUser;

public interface AdminUserService extends IService<AdminUser> {
    AdminUser login(String username, String password);
}