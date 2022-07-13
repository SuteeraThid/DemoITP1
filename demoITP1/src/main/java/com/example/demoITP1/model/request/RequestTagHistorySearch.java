package com.example.demoITP1.model.request;

import com.example.demoITP1.model.list.DurationList;
import com.example.demoITP1.model.list.StationRateList;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class RequestTagHistorySearch extends RequestCommon{
    @JsonProperty("tagDateCreated")
    private String floorNam3e;
    @JsonProperty("tagDateCreated")
    private List<DurationList> durationLists;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone = "GMT+7")
    @JsonProperty("hsDate")
    private LocalDateTime hsDate;
    @JsonProperty("stationRateList")
    private List<StationRateList> stationRateList;
    @JsonProperty("checkbox")
    private boolean checkbox;

    public String getFloorNam3e() {
        return floorNam3e;
    }

    public void setFloorNam3e(String floorNam3e) {
        this.floorNam3e = floorNam3e;
    }

    public List<DurationList> getDurationLists() {
        return durationLists;
    }

    public void setDurationLists(List<DurationList> durationLists) {
        this.durationLists = durationLists;
    }

    public LocalDateTime getHsDate() {
        return hsDate;
    }

    public void setHsDate(LocalDateTime hsDate) {
        this.hsDate = hsDate;
    }

    public List<StationRateList> getStationRateList() {
        return stationRateList;
    }

    public void setStationRateList(List<StationRateList> stationRateList) {
        this.stationRateList = stationRateList;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }

    @Override
    public String toString() {
        return "RequestTagHistorySearch{" +
                "RequestCommon{" +
                "userAgent='" + getUserAgent() + '\'' +
                ", sessionID='" + getSessionID() + '\'' +
                ", actionBy='" + getActionBy() + '\'' +
                ", sessionRefCode='" + getSessionRefCode() + '\'' +
                '}'+
                "floorNam3e='" + floorNam3e + '\'' +
                ", durationLists=" + durationLists +
                ", hsDate=" + hsDate +
                ", stationRateList=" + stationRateList +
                ", checkbox=" + checkbox +
                '}';
    }
}
