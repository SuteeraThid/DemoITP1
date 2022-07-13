package com.example.demoITP1.model.response;

import com.example.demoITP1.model.list.AnchorList;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class ResponseAnchorManageList extends ResponseCommon{
    @JsonProperty("anchorList")
    private List<AnchorList> anchorList;
    @JsonProperty("userName")
    private String userName;

    public List<AnchorList> getAnchorList() {
        return anchorList;
    }

    public void setAnchorList(List<AnchorList> anchorList) {
        this.anchorList = anchorList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ResponseAnchorManageList{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "anchorList=" + anchorList +
                ", userName='" + userName + '\'' +
                '}';
    }
}