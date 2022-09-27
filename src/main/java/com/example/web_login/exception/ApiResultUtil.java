package com.example.web_login.exception;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;

/**
 * @Classname ResultUtil
 * @Date 2022/9/27 0027:11:59
 * @Created by Yang
 */
public class ApiResultUtil {

    public ApiResultUtil() {
    }

    public static ApiResult retResult(Integer httpCode, ApiResultCode resultCode, Object object, String addiInfo) {
        ApiResult<Object> result = new ApiResult<>();
        result.setHttpCode(httpCode);
        result.setCode(resultCode.getCode());
        result.setMessage(resultCode.getMsg());
        result.setData(object);
        result.setAddiInfo(addiInfo);
        return result;
    }



    public static ApiResult success(Object object, String addiInfo) {
        return retResult(HttpStatus.OK.value(), ApiResultCode.SUCCESS, object, addiInfo);
    }

    public static ApiResult success(Object object) {
        return retResult(HttpStatus.OK.value(), ApiResultCode.SUCCESS, object, (String)null);
    }

    public static ApiResult success(Integer httpCode, Object object, String addiInfo) {
        return retResult(httpCode, ApiResultCode.SUCCESS, object, addiInfo);
    }

    public static ApiResult success() {
        return success((Object)null, (String)null);
    }


    public static ApiResult error(ApiResultCode resultCode) {
        return retResult(HttpStatus.BAD_REQUEST.value(), resultCode, (Object)null, (String)null);
    }

    public static ApiResult error(ApiResultCode resultCode, String addiInfo) {
        return retResult(HttpStatus.BAD_REQUEST.value(), resultCode, (Object)null, addiInfo);
    }

    public static ApiResult error(Integer httpCode, ApiResultCode resultCode, String addiInfo) {
        return retResult(httpCode, resultCode, (Object)null, addiInfo);
    }



    public static ApiResult<Object> getApiResult(String JsonStr) {
        ApiResult<Object> result = new ApiResult();
        JSONObject jsonObject = new JSONObject(JsonStr);
        result.setCode(jsonObject.getInt("code"));
        result.setMessage(jsonObject.getString("msg"));
        Object object = jsonObject.get("data");
        Object addInfo = jsonObject.get("addiInfo");
        if (addInfo != null) {
            result.setAddiInfo(addInfo.toString());
        }
        if (null != object) {
            result.setData(object);
        }
        return result;
    }


}