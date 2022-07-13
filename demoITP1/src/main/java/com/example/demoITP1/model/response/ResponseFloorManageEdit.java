package com.example.demoITP1.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseFloorManageEdit extends ResponseCommon{
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
        return "ResponseFloorManageEdit{" +
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
