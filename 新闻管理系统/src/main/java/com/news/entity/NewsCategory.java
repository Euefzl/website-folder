package com.news.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("news_category")
public class NewsCategory {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer sort;
    private LocalDateTime createTime;
}