package com.yzf.myblog.common;

import lombok.Data;

import java.io.Serializable;

/**
 * name:余泽斐
 * 返回结果封装类
 */
@Data
public class Result implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public static Result success(String code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
    public static Result success(Object data){
        return success("200","操作成功",data);
    }

    public static Result error(Object data){
        Result result = new Result();
        result.setCode("400");
        result.setMsg("数据错误");
        result.setData(data);
        return result;
    }

    public static Result exception(String code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
