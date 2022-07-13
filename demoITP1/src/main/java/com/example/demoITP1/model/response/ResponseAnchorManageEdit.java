package com.example.demoITP1.model.response;

import com.example.demoITP1.model.list.FloorList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseAnchorManageEdit extends ResponseCommon{
    @JsonProperty("floorList")
    private List<FloorList> floorList;

    public List<FloorList> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<FloorList> floorList) {
        this.floorList = floorList;
    }

    @Override
    public String toString() {
        return "ResponseAnchorManageEdit{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "floorList=" + floorList +
                '}';
    }
}
