package com.example.web_login;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.TimeZone;


@MapperScan("com.example.web_login.mapper")
//@EnableDiscoveryClient
@EnableScheduling
@EnableAsync
//@EnableFeignClients
@SpringBootApplication
public class WebLoginApplication {

    static {
        System.setProperty("druid.mysql.usePingMethod", "false");
    }

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(WebLoginApplication.class, args);
    }

}
