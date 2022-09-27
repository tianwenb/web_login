package com.example.web_login.controller;

import com.example.web_login.entity.UserLogin;
import com.example.web_login.service.UserLoginService;
import com.example.web_login.exception.ApiException;
import com.example.web_login.exception.ApiResult;
import com.example.web_login.exception.ApiResultCode;
import com.example.web_login.exception.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
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
    @GetMapping("/sign-in")
    @CrossOrigin
    public ApiResult signIn(@RequestParam String account,
                            @RequestParam String password)
    {
        if (!StringUtils.hasLength(account) || !StringUtils.hasLength(password) ) {
            throw new ApiException(ApiResultCode.PARAMS_ERROR,"参数为空");
        }

        UserLogin userLogin = new UserLogin();
        userLogin.setAccount(account);
        userLogin.setPassword(password);
        return ApiResultUtil.success(userLoginService.signIn(userLogin));
    }


    @ApiOperation(value = "注册")
    @PostMapping("/sign-up")
    public ApiResult signUp(@RequestParam Map<String, String> params)
    {
        if (!StringUtils.hasLength(params.get("phone")) || !StringUtils.hasLength(params.get("password")) || !StringUtils.hasLength(params.get("account")) ) {
            throw new ApiException(ApiResultCode.PARAMS_ERROR,"参数为空");
        }
        return ApiResultUtil.success(userLoginService.signUp(params));
    }

}