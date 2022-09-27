package com.example.web_login.service;

import com.example.web_login.entity.UserLogin;
import com.example.web_login.pojo.vo.UserVO;

import java.util.Map;

/**
 * @Classname UserLoginService
 * @Date 2022/9/22 0022:17:59
 * @Created by Yang
 */
public interface UserLoginService {
    boolean signIn(UserLogin userLogin);

    int signUp(Map<String, String> params);
}