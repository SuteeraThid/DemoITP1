package com.example.demoITP1.model.request;

import com.example.demoITP1.model.response.ResponseCommon;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class RequestAnchorManageList extends RequestCommon {
    @JsonProperty("anchorID")
    private String anchorID;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone = "GMT+7")
    @JsonProperty("anchorDateCreated")
    private LocalDateTime anchorDateCreated;
    @JsonProperty("userName")
    private String userName;

    public String getAnchorID() {
        return anchorID;
    }

    public void setAnchorID(String anchorID) {
        this.anchorID = anchorID;
    }

    public LocalDateTime getAnchorDateCreated() {
        return anchorDateCreated;
    }

    public void setAnchorDateCreated(LocalDateTime anchorDateCreated) {
        this.anchorDateCreated = anchorDateCreated;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "RequestAnchorManageList{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "anchorID='" + anchorID + '\'' +
                ", anchorDateCreated=" + anchorDateCreated +
                ", userName='" + userName + '\'' +
                '}';
    }
}
