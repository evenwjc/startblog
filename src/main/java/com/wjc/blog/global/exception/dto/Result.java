package com.wjc.blog.global.exception.dto;

import lombok.Data;

/**
 * @ClassName Result
 * @anthor weijiachen
 * @Date 2021-08-25 19:21
 * @Description 结果统一返回实体
 */

@Data
public class Result<T> {
    /** 状态码 */
    private Integer code;
    /** 描述 */
    private String msg;
    /** 结果内容 */
    private T result;

    public Result(Integer code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public Result() {
    }
}
