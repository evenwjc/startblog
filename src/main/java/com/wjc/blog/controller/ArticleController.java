package com.wjc.blog.controller;

import com.wjc.blog.constant.enums.ResultCode;
import com.wjc.blog.global.exception.dto.Result;
import com.wjc.blog.model.entity.Article;
import com.wjc.blog.service.inf.ArticleService;
import com.wjc.blog.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ArticleController
 * @anthor weijiachen
 * @Date 2021-08-30 19:18
 * @Description 文章管理
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    //日志处理

    @Autowired
    ArticleService articleService;

    /**
     * 发布文章
     * @param article
     * @return
     */
    @RequestMapping("/create")
    public Result create(Article article){
        articleService.create(article);
        return ResultUtils.suceess(ResultCode.SUCCESS);
    }

    /**
     * 更新文章
     * @param article
     * @return
     */
    @RequestMapping("/update")
    public Result update(Article article){
        Result<Object> result = new Result<>();
        return result;
    }

    /**
     * 删除文章
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        Result<Object> result = new Result<>();
        return result;
    }

    /**
     * 查看文章
     * @param id
     * @return
     */
    @RequestMapping("/view/{id}")
    public Result view(@PathVariable Long id){
        Result<Object> result = new Result<>();
        return result;
    }

}
