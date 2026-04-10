package com.su.usercenter.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author NoPwd
 * @version 1.0
 * @description: 用户登录请求体
 * @date 2026/4/3 18:55
 */
@Data
public class UserLoginRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 8428912316762078L;

    private String userAccount;
    private String userPassword;

}
