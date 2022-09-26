package com.example.web_login.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.web_login.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
