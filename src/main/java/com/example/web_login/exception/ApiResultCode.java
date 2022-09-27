package com.example.web_login.exception;

/**
 * @Classname ResultCode
 * @Date 2022/9/27 0027:11:57
 * @Created by Yang
 */
public enum ApiResultCode {

    UNKONW_ERROR(-1, "Unknown error", "未知错误"),
    SUCCESS(200, "Success", "成功"),
    FAILURE(201, "Failure", "失败"),
    NO_DATA_FOUND(202, "Data not found", "未找到数据"),
    ADD_FAILED(203, "Add failed", "添加失败"),
    UPDATE_FAILED(204, "Updated failed", "更新失败"),
    DELETE_FAILED(205, "Delete failed", "删除失败"),
    DATA_ALREADY_EXIST(206, "Data already existed", "数据已经存在"),
    DB_OPERATION_FAILED(208, "Database operation failed", "操作数据库失败"),
    NOT_ALLOWED(209, "不允许", "不允许"),
    SERVER_ERROR(210, "Server error", "服务器错误"),
    AUTH_ERROR(211, "Authentication failed ", "鉴权失败"),
    PARAMS_ERROR(212, "Parameter error", "参数错误"),
    JSON_PARSE_ERROR(213, "Json parse error", "JSON解析错误"),
    ILLEAGAL_STRING(214, "Illegal string", "非法字符串");

    private Integer code;
    private String msg;
    private String msgCh;

    private ApiResultCode(Integer code, String msg, String msgCh) {
        this.code = code;
        this.msg = msg;
        this.msgCh = msgCh;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getMsgCh() {
        return this.msgCh;
    }

}