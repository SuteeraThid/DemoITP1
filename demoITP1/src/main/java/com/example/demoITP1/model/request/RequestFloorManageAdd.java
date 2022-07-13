package com.example.demoITP1.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestFloorManageAdd extends RequestCommon{
    @JsonProperty("floorName")
    private String floorName;
    @JsonProperty("floorWidth")
    private int floorWidth;
    @JsonProperty("floorHeight")
    private int floorHeight;

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public int getFloorWidth() {
        return floorWidth;
    }

    public void setFloorWidth(int floorWidth) {
        this.floorWidth = floorWidth;
    }

    public int getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(int floorHeight) {
        this.floorHeight = floorHeight;
    }

    @Override
    public String toString() {
        return "RequestFloorManageAdd{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "floorName='" + floorName + '\'' +
                ", floorWidth=" + floorWidth +
                ", floorHeight=" + floorHeight +
                '}';
    }
}
