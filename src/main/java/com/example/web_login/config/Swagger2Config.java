package com.example.web_login.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ConfigurationProperties(prefix = "api-doc.dev-api.show")
public class Swagger2Config {

    @Value("${api-doc.dev-api.show}")
    private boolean devApiShow;

    @Value("${api-doc.public-api.show}")
    private boolean publicApiShow;

    @Bean
    public Docket devDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("内部开发用API接口文档")
                //配置是否启用Swagger，如果是false，在浏览器将无法访问，默认是true
                .enable(devApiShow)
                .apiInfo(apiInfo("提供内部开发用API"))
                //.pathMapping("/internal")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.web_login.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket publicDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("公用API接口文档")
                .enable(publicApiShow)
                .apiInfo(apiInfo("提供通用接口"))
                //.pathMapping("/public")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.web_login.controller"))
                .paths(PathSelectors.ant("/public/**"))
                .build();
    }

    private ApiInfo apiInfo(String desc) {
        return new ApiInfoBuilder()
                .title("Authentication")
                .version("1.0.0")
                .build();
    }
}
