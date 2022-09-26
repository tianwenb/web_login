package com.example.web_login.controller;

import com.example.web_login.entity.UserLogin;
import com.example.web_login.pojo.vo.UserVO;
import com.example.web_login.service.UserLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Classname UserController
 * @Date 2022/9/22 0022:18:07
 * @Created by Yang
 */
@Api(tags = "")
@RequestMapping("web_login/private/user")
@RestController
public class UserController {

    @Resource
    private UserLoginService userLoginService;

    @ApiOperation(value = "登录")
    @GetMapping("/login")
    public UserVO login(@RequestParam String account,
                        @RequestParam String pwd)
    {
        UserLogin userLogin = new UserLogin();
        userLogin.setAccount(account);
        userLogin.setPassword(pwd);
        return userLoginService.login(userLogin);
    }


    @ApiOperation(value = "注册")
    @PostMapping("/sign-up")
    public int signup(@RequestParam Map<String, String> params)
    {
        return userLoginService.signup(params);
    }

}