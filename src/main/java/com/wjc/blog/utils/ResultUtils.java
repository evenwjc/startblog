package com.wjc.blog.utils;

import com.wjc.blog.constant.enums.ResultCode;
import com.wjc.blog.global.exception.dto.Result;

/**
 * @ClassName ResultUtils
 * @anthor weijiachen
 * @Date 2021-08-31 20:37
 * @Description 返回结果处理工具类
 */
public class ResultUtils {

    public static Result suceess(ResultCode status){
        return ResultVO(status.getCode(),status.getMsg(),null);
    }

    public static Result ResultVO(Integer code,String msg,Object data){
        return new Result<>(code,msg,data);
    }
}
