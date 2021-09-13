package com.wjc.blog.service.impl;

import com.wjc.blog.model.entity.Article;
import com.wjc.blog.service.inf.ArticleService;

/**
 * @ClassName ArticleServiceImpl
 * @anthor weijiachen
 * @Date 2021-08-30 19:46
 * @Description 文章服务实现类
 */
public class ArticleServiceImpl implements ArticleService {
    @Override
    public boolean create(Article article) {
        //处理实体数据

        //文章信息写数据库
        return false;
    }

    @Override
    public boolean update(Article article) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean view(Integer id) {
        return false;
    }

}
