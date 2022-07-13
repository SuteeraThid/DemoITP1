package com.example.demoITP1.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCommon {
    @JsonProperty("userAgent")
    private String userAgent;
    @JsonProperty("sessionID")
    private String sessionID;
    @JsonProperty("actionBy")
    private String actionBy;
    @JsonProperty("sessionRefCode")
    private String sessionRefCode;

    public String getUserAgent() {      // ตัวแปรถูกเอาไปใช้ โค้ดเลยกลายเป็นสีส้ม
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    public String getSessionRefCode() {
        return sessionRefCode;
    }

    public void setSessionRefCode(String sessionRefCode) {
        this.sessionRefCode = sessionRefCode;
    }

    @Override
    public String toString() {
        return "RequestCommon{" +
                "userAgent='" + userAgent + '\'' +
                ", sessionID='" + sessionID + '\'' +
                ", actionBy='" + actionBy + '\'' +
                ", sessionRefCode='" + sessionRefCode + '\'' +
                '}';
    }
}
