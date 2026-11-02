package com.news.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 全局跨域配置
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")                // 所有接口都跨域
                .allowedOriginPatterns("*")       // 允许所有前端域名
                .allowedMethods("*")              // 允许所有请求方法（GET/POST/PUT/DELETE...）
                .allowedHeaders("*")              // 允许所有请求头
                .allowCredentials(true)           // 允许带 Cookie（登录会话必须）
                .maxAge(3600);                    // 预检请求缓存1小时
    }
}