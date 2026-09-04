package com.springbootlearning.controller;

public class Result {
    // 响应码：1-成功，0-失败
    private Integer code;
    // 响应码 描述字符串
    private String msg;
    // 响应数据
    private Object data;

    public Result() {
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // 增删改 成功响应（不需要返回前端数据）
    public static Result success() {
        return new Result(1, "操作成功", null);
    }

    // 查询 成功
    public static Result success(Object data) {
        return new Result(1, "操作成功", data);
    }

    // 失败响应
    public static Result fail(String msg) {
        return new Result(0, msg, null);
    }
}
