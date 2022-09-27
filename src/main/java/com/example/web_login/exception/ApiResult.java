package com.example.web_login.exception;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Classname Result
 * @Date 2022/9/27 0027:11:54
 * @Created by Yang
 */

@Data
public class ApiResult<T> implements Serializable {

    @ApiModelProperty("http专用错误码")
    private Integer httpCode;

    @ApiModelProperty("业务错误码")
    private Integer code;

    @ApiModelProperty("错误码信息")
    private String message;

    @ApiModelProperty("错误码额外信息，当msg不能满足的情况下使用")
    private String addiInfo;

    @ApiModelProperty("返回值的内容")
    private T data;

    public ApiResult(){

    }

    @Override
    public String toString() {
        return "Result{" +
                "httpCode=" + httpCode +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", addiInfo='" + addiInfo + '\'' +
                ", data=" + data +
                '}';
    }
}