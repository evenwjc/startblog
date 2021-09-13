package com.wjc.blog.constant.enums;

/**
 * @ClassName ResultCode
 * @anthor weijiachen
 * @Date 2021-08-25 18:40
 * @Description 返回结果状态码
 */
public enum ResultCode {
    /** 成功 */
    SUCCESS(200,"成功"),
    /** 失败 */
    FAILED(400,"失败")
    ;
    /**
     * 状态码
     */
    private int code;
    /**
     * 状态码描述
     */
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
