package com.su.usercenter.common;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author NoPwd
 * @version 1.0
 * @description: 通用响应实体
 * @date 2026/4/6 13:38
 */

@Data
public class BaseResponse<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 7917693794384661543L;

    private int code;

    private T data;

    private String message;

    private String description;

    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, T data, String message) {
        this(code, data, message, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }

    public BaseResponse(ErrorCode errorCode, String message, String description) {
        this(errorCode.getCode(), null, message, description);
    }

    public BaseResponse(int code, String message, String description) {
        this(code, null, message, description);
    }
}
