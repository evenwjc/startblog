package com.wjc.blog.model.entity;

import lombok.Data;

/**
 * @ClassName Article
 * @anthor weijiachen
 * @Date 2021-08-30 18:54
 * @Description TDOD
 */
@Data
public class Article {

    public Article() {
    }

    /**
     * 文章id
     */
    private Long articleId;
    /**
     * 文章标题
     */
    private String articleName;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 最近更新时间
     */
    private String updateTime;
    /**
     * 标签
     */
    private Long[] tags;
    /**
     * 点赞数
     */
    private Integer like;
    /**
     * 评论数
     */
    private Integer comment;
}
