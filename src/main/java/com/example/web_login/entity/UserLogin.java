package com.example.web_login.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Classname user_login
 * @Date 2022/9/22 0022:17:47
 * @Created by Yang
 */

@Data
@TableName(value = "user_login")
public class UserLogin {

    @TableId(value = "user_id")
    private Integer userId;

    private String account;

    private String password;
}