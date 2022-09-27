package com.example.web_login.exception;

/**
 * @Classname ApiExcption
 * @Date 2022/9/27 0027:14:04
 * @Created by Yang
 */

public class ApiException extends RuntimeException {

    private ApiResult apiResult;

    public ApiResult getApiResult() {
        return this.apiResult;
    }

    public void setApiResult(ApiResult apiResult) {
        this.apiResult = apiResult;
    }


    public ApiException(ApiResultCode resultCode, String addiInfo) {
        this.apiResult = ApiResultUtil.error(resultCode,addiInfo);
    }


    public String toString() {
        return "ApiException{apiResult=" + this.apiResult + '}';
    }

}