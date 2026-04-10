package com.su.usercenter.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author NoPwd
 * @version 1.0
 * @description: 用户注册请求体
 * @date 2026/4/3 18:55
 */
@Data
public class UserRegisterRequest implements Serializable {

    private String userAccount;
    private String userPassword;
    private String checkPassword;

    /**
     * 星球编号
     */
    private String planetCode;

    @Serial
    private static final long serialVersionUID = -3680637851700182850L;
}
