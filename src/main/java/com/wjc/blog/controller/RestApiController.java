package com.wjc.blog.controller;

import com.wjc.blog.global.exception.dto.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RestController
 * @anthor weijiachen
 * @Date 2021-08-31 20:14
 * @Description 点赞和评论管理
 */
@RestController
@RequestMapping("/restApi")
public class RestApiController {
    //日志

    /**
     * 文章点赞
     * 个人博客--暂时不开发点赞功能
     * @param id
     * @return
     */
    /*@RequestMapping("/like/{id}")
    public Result like(@PathVariable Integer id){
        Result<Object> result = new Result<>();
        return result;
    }*/

    /**
     * 个人博客--暂不设计评论功能
     */
}
