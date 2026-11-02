package com.news.entity;

public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result success() {
        Result r = new Result();
        r.setCode(200);
        r.setMsg("操作成功");
        return r;
    }

    public static Result success(String msg) {
        Result r = new Result();
        r.setCode(200);
        r.setMsg(msg);
        return r;
    }

    public static Result success(Object data) {
        Result r = new Result();
        r.setCode(200);
        r.setData(data);
        return r;
    }

    public static Result error(String msg) {
        Result r = new Result();
        r.setCode(500);
        r.setMsg(msg);
        return r;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}