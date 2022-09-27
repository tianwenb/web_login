/*
package com.example.web_login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

*/
/**
 * @Classname CorsConfig
 * @Date 2022/9/27 0027:14:50
 * @Created by Yang
 *//*


@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("/**");//允许哪些域访问
        corsConfiguration.addAllowedHeader("*");//允许哪些请求头访问
        corsConfiguration.addAllowedMethod("*");//允许哪些请求方法访问
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",corsConfiguration);//设置映射
        return new CorsFilter(source);
    }
}*/
