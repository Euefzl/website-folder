package com.news.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.news.common.Result;
import com.news.entity.News;
import com.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/page")
    public Result page(Integer pageNum, Integer pageSize) {
        Page<News> page = new Page<>(pageNum, pageSize);
        IPage<News> iPage = newsService.page(page);
        return Result.success(iPage);
    }

    @PostMapping("/add")
    public Result add(@RequestBody News news) {
        news.setCreateTime(LocalDateTime.now());
        newsService.save(news);
        return Result.success("添加成功");
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        newsService.removeById(id);
        return Result.success("删除成功");
    }
}