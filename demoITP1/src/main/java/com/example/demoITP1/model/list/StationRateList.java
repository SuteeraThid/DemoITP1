package com.example.demoITP1.model.list;

public class StationRateList {
    private int stationRate;

    public StationRateList() {
    }

    public int getStationRate() {
        return stationRate;
    }

    public void setStationRate(int stationRate) {
        this.stationRate = stationRate;
    }

    @Override
    public String toString() {
        return "StationRateList{" +
                "stationRate=" + stationRate +
                '}';
    }
}
