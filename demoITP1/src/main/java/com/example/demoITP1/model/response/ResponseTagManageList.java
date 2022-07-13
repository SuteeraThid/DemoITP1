package com.example.demoITP1.model.response;

import com.example.demoITP1.model.list.TagList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseTagManageList extends ResponseCommon{
    @JsonProperty("tagList")
    private List<TagList> tagList;
    @JsonProperty("userName")
    private String userName;

    public List<TagList> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagList> tagList) {
        this.tagList = tagList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ResponseTagManageList{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "tagList=" + tagList +
                ", userName='" + userName + '\'' +
                '}';
    }
}
