package com.example.demoITP1.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class ResponseCommon {
    @JsonProperty("responseCode")
    private String responseCode;
    @JsonProperty("responseStatus")
    private String responseStatus;
    @JsonProperty("responseMessage")
    private String responseMessage;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone = "GMT+7")
    @JsonProperty("serverDateTime")
    private LocalDateTime serverDateTime;     // datetime dd-MM-yyyy
    @JsonProperty("sessionRefCode")
    private String sessionRefCode;

    // สร้าง Method ขึ้นมาใหม่ 1
    public void setError(ResponseCode reqCode){
        this.responseCode = reqCode.getErrCode();       // get ค่า err จาก ResponseCode มา set ให้ responseCode กับ responseStatus
        this.responseStatus = reqCode.getErrStatus();
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public LocalDateTime getServerDateTime() {
        return serverDateTime;
    }

    public void setServerDateTime(LocalDateTime serverDateTime) {
        this.serverDateTime = serverDateTime;
    }

    public String getSessionRefCode() {
        return sessionRefCode;
    }

    public void setSessionRefCode(String sessionRefCode) {
        this.sessionRefCode = sessionRefCode;
    }

    @Override
    public String toString() {
        return "ResponseCommon{" +
                "responseCode='" + responseCode + '\'' +
                ", responseStatus='" + responseStatus + '\'' +
                ", responseMessage='" + responseMessage + '\'' +
                ", serverDateTime=" + serverDateTime +
                ", sessionRefCode='" + sessionRefCode + '\'' +
                '}';
    }
}
