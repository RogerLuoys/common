package com.luoys.common.api;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor  // 需要这个无参构造函数，否则Feign会报错
public class Result<T> implements Serializable {
    private int code;
    private boolean success;
    private String message;
    private T data;
    private static final long serialVersionUID = 1L;

    Result (int code, boolean success, String message, T data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static <T> Result ifSuccess (T data) {
        Result<T> result = new Result(1, true, "成功", data);
        if (data == null) {
            result.setCode(-1);
            result.setData(null);
            result.setSuccess(false);
            result.setMessage("业务异常");
        }
        return result;
    }

    public static <T> Result success (T data) {
        Result<T> result = new Result(1, true, "成功", data);
        return result;
    }

    public static <T> Result success (T data, String message) {
        Result<T> result = new Result(1, true, message, data);
        return result;
    }

    public static <T> Result error (String message) {
        Result<T> result = new Result(0, false, message, null);
        return result;
    }

    public static <T> Result error (String message, int code) {
        Result<T> result = new Result(code, false, message, null);
        return result;
    }
}