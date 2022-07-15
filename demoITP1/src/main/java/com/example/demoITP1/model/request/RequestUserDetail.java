package com.example.demoITP1.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestUserDetail extends RequestCommon{
    @JsonProperty("userID")
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "RequestUserDetail{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "userId=" + userId +
                '}';
    }
}
