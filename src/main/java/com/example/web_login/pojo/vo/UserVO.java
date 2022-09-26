package com.example.web_login.pojo.vo;

import lombok.Data;

/**
 * @Classname UserVO
 * @Date 2022/9/23 0023:10:24
 * @Created by Yang
 */

@Data
public class UserVO {
    private Integer userId;

    private String account;

    private String password;

    private String name;

    private String phone;

    private Integer userSex;

    private String userImage;
}