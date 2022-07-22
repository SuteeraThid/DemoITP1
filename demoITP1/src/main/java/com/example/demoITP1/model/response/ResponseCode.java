package com.example.demoITP1.model.response;

public enum ResponseCode {
    LG0101("lg0101", "FAIL"),
    LG0102("lg0102", "FAIL"),
    LG00103("lg0103","FAIL"),
    SUCCESS_WEB("0000", "succes"),
    USERAGENT_IS_EMPTY("cm0102", "FAIL"),
    SESSIONID_IS_EMPTY("cm0103", "FAIL"),
    ACTIONBY_IS_EMPTY("cm0106", "FAIL"),
    SESSIONREFCODE_IS_EMPTY("cm0107", "FAIL"),
    SESSIONID_NOT_FOUND("cm0104", "FAIL"),
    SESSIONID_EXPIRE("cm0105", "FAIL"),
    FLOORNAME_IS_EMPTY("cm1011", "FAIL"),
    UNKNOWN_ERROR("999", "FAIL"),
    USR0201("usr0201","FAIL"),
    USR0401("usr0401","FAIL"),
    USR0404("usr0404","FAIL");
    private final String errCode;
    private final String errStatus;

    // Constructor
    ResponseCode(String errCode, String errStatus) {
        this.errCode = errCode;
        this.errStatus = errStatus;
    }
    public String getErrCode() {        // ใช้ที่ class ResponseCommon
        return errCode;
    }

    public String getErrStatus() {      // ใช้ที่ class ResponseCommon
        return errStatus;
    }


}
