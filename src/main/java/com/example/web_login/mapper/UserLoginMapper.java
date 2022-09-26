package com.example.web_login.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.web_login.entity.User;
import com.example.web_login.entity.UserLogin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname UserLoginMapper
 * @Date 2022/9/22 0022:17:55
 * @Created by Yang
 */
@Mapper
public interface UserLoginMapper extends BaseMapper<UserLogin> {

}
