package com.wjc.blog.service.inf;

import com.wjc.blog.model.entity.Article;

/**
 * 文章服务
 */
public interface ArticleService {
    /**
     * 发布文章
     * @param article
     * @return
     */
    boolean create(Article article);

    /**
     * 更新文章
     * @param article
     * @return
     */
    boolean update(Article article);

    /**
     * 删除文章
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 查看文章
     * @param id
     * @return
     */
    boolean view(Integer id);

}
