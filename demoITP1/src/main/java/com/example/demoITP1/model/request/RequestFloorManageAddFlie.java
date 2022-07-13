package com.example.demoITP1.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestFloorManageAddFlie extends RequestCommon{
    @JsonProperty("floorFile")
    private String floorFile;

    public String getFloorFile() {
        return floorFile;
    }

    public void setFloorFile(String floorFile) {
        this.floorFile = floorFile;
    }

    @Override
    public String toString() {
        return "RequestFloorManageAddFlie{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "floorFile='" + floorFile + '\'' +
                '}';
    }
}
