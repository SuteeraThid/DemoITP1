package com.example.demoITP1.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestSignIn extends RequestCommon {
    @JsonProperty("userEmail")
    private String userEmail;
    @JsonProperty("userPassword")
    private String userPassword;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "RequestSignIn{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
