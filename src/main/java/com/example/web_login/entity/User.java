package com.example.web_login.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Classname user
 * @Date 2022/9/22 0022:17:47
 * @Created by Yang
 */
@Data
@TableName(value = "user")
public class User {
    @TableId(value = "user_id",type = IdType.AUTO)
    private Integer userId;

    private String name;

    private String phone;

    private Integer userSex;

    private String userImage;
}