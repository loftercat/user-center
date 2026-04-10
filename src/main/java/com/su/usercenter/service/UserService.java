
package com.su.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.su.usercenter.model.User;
import jakarta.servlet.http.HttpServletRequest;

/**
 * 用户服务接口
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * @description: 用户脱敏
     * @param: [originUser]
     * @return: com.su.usercenter.model.User
     * @author NoPwd
     * @date: 2026/4/4 14:50
     */
    User getSafetyUser(User originUser);
    
    /**
     * @description: 用户登出
     * @param: [request]
     * @author NoPwd
     * @date: 2026/4/4 19:41
     */ 
    int userLogout(HttpServletRequest request);
}
