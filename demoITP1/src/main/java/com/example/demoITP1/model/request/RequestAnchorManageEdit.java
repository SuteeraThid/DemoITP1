package com.example.demoITP1.model.request;

import com.example.demoITP1.model.list.AnchorList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RequestAnchorManageEdit extends RequestCommon{
    @JsonProperty("anchorList")
    private List<AnchorList> anchorList;
    @JsonProperty("floorName")
    private String floorName;

    public List<AnchorList> getAnchorList() {
        return anchorList;
    }

    public void setAnchorList(List<AnchorList> anchorList) {
        this.anchorList = anchorList;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    @Override
    public String toString() {
        return "RequestAnchorManageEdit{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "anchorList=" + anchorList +
                ", floorName='" + floorName + '\'' +
                '}';
    }
}
