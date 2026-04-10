package com.su.usercenter.service.impl;

import com.su.usercenter.model.User;
import com.su.usercenter.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("测试用户");
        user.setUserAccount("testuser");
        user.setAvatarUrl("https://example.com/avatar.jpg");
        user.setGender(0);
        user.setUserPassword("12345678");
        user.setPhone("13800138000");
        user.setEmail("test@example.com");
        user.setUserStatus(0);

        userService.save(user);

        System.out.println("用户ID: " + user.getId());
    }

    @Test
    void userRegister() {
        String userAccount = "su99";
        String userPassword = "123";
        String checkPassword = "12345678";
        String planetCode = "1";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);

        userAccount = "su";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);

        userAccount = "su99";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);

        userAccount = "su99)_";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);

        userAccount = "su99";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertTrue(result > 0);
    }

    @Test
    void doLogin() {

    }
}