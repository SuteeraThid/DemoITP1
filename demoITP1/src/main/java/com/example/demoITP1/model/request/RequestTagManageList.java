package com.example.demoITP1.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class RequestTagManageList extends RequestCommon{
    @JsonProperty("tagID")
    private String tagID;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone = "GMT+7")
    @JsonProperty("tagDateCreated")
    private LocalDateTime tagDateCreated;
    @JsonProperty("userName")
    private String userName;

    public String getTagID() {
        return tagID;
    }

    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    public LocalDateTime getTagDateCreated() {
        return tagDateCreated;
    }

    public void setTagDateCreated(LocalDateTime tagDateCreated) {
        this.tagDateCreated = tagDateCreated;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "RequestTagManageList{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "tagID='" + tagID + '\'' +
                ", tagDateCreated=" + tagDateCreated +
                ", userName='" + userName + '\'' +
                '}';
    }
}

