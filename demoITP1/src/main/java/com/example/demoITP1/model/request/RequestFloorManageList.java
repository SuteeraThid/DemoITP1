package com.example.demoITP1.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.PrimitiveIterator;

public class RequestFloorManageList extends RequestCommon{
    private String floorName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone = "GMT+7")
    @JsonProperty("floorDateCreated")
    private LocalDateTime floorDateCreated;

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    @Override
    public String toString() {
        return "RequestFloorManageList{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "floorName='" + floorName + '\'' +
                ", floorDateCreated=" + floorDateCreated +
                '}';
    }
}
