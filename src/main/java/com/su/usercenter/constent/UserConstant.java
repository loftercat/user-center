package com.su.usercenter.constent;

/**
 * @author NoPwd
 * @version 1.0
 * @description: 用户常量
 * @date 2026/4/4 13:23
 */
public final class UserConstant {

    /**
     * 用户登录状态
     */
    public static final String USER_LOGIN_STATE = "userLoginState";

    /**
     * 默认普通用户权限
     */
    public static final int DEFAULT_ROLE = 0;

    /**
     * 管理员权限
     */
    public static final int ADMIN_ROLE = 1;

    /**
     * 私有构造方法，防止实例化
     */
    private UserConstant() {
    }
}
