package com.wjc.blog.service.inf;

/**
 * @ClassName RestApiService
 * @anthor weijiachen
 * @Date 2021-08-31 20:19
 * @Description 点赞和评论服务
 */
public interface RestApiService {
    /**
     * 文章点赞
     * @param id
     */
    void like(Integer id);
}
