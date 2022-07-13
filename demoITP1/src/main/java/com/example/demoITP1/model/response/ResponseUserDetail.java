package com.example.demoITP1.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.ResponseEntity;

public class ResponseUserDetail extends ResponseCommon{
    @JsonProperty("userID")
    private String userID;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("userName")
    private String userEmail;
    @JsonProperty("userPassword")
    private String userPassword;
    @JsonProperty("userImage")
    private String userImage;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

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

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    @Override
    public String toString() {
        return "ResponseUserDetail{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userImage='" + userImage + '\'' +
                '}';
    }
}
