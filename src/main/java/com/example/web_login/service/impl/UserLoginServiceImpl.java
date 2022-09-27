package com.example.web_login.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.web_login.entity.User;
import com.example.web_login.entity.UserLogin;
import com.example.web_login.mapper.UserLoginMapper;
import com.example.web_login.mapper.UserMapper;
import com.example.web_login.pojo.vo.UserVO;
import com.example.web_login.service.UserLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Classname UserLoginServiceImpl
 * @Date 2022/9/22 0022:18:00
 * @Created by Yang
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Resource
    private UserLoginMapper userLoginMapper;

    @Resource
    private UserMapper userMapper;

    @Override
    public boolean signIn(UserLogin userLogin) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("account",userLogin.getAccount());
        UserLogin localUser = userLoginMapper.selectOne(wrapper);
        if (localUser.getPassword().equals(userLogin.getPassword())){
           return true;
        }
        return false;
    }

    @Override
    public int signUp(Map<String, String> params) {
        User user = new User();
        user.setPhone(params.get("phone"));
        user.setName("web-"+params.get("phone"));
        int res = userMapper.insert(user);

        if (res>0){
            UserLogin userLogin = new UserLogin();
            userLogin.setUserId(user.getUserId());
            userLogin.setPassword(params.get("password"));
            userLogin.setAccount(params.get("account"));
            userLoginMapper.insert(userLogin);
        }

        return res;
    }
}