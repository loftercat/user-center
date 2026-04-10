package com.su.usercenter.exception;

import com.su.usercenter.common.ErrorCode;
import lombok.Getter;

import java.io.Serial;

/**
 * @author NoPwd
 * @version 1.0
 * @description: TODO
 * @date 2026/4/6 15:49
 */

@Getter
public class BusinessException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1017136383951543316L;

    private final int code;

    private final String description;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }
}
