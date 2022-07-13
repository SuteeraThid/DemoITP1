package com.example.demoITP1.model.response;

import com.example.demoITP1.model.list.FloorList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseFloorManageList extends ResponseCommon{
    @JsonProperty("floorList")
    private List<FloorList> floorList;
    @JsonProperty("userName")
    private String userName;

    public List<FloorList> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<FloorList> floorList) {
        this.floorList = floorList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ResponseFloorManageList{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "floorList=" + floorList +
                ", userName='" + userName + '\'' +
                '}';
    }
}
