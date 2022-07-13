package com.example.demoITP1.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseFloorManageAdd extends ResponseCommon{
    @JsonProperty("floorCoordinate")
    private int floorCoordinate;

    public int getFloorCoordinate() {
        return floorCoordinate;
    }

    public void setFloorCoordinate(int floorCoordinate) {
        this.floorCoordinate = floorCoordinate;
    }

    @Override
    public String toString() {
        return "ResponseFloorManageAdd{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus() + '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionRefCode()+ '\'' +
                '}'+
                "floorCoordinate=" + floorCoordinate +
                '}';
    }
}
