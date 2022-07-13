package com.example.demoITP1.model.list;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NormalRateList {
    @JsonProperty("normalRate")
    private int normalRate;

    public NormalRateList() {
    }

    public int getNormalRate() {
        return normalRate;
    }

    public void setNormalRate(int normalRate) {
        this.normalRate = normalRate;
    }

    @Override
    public String toString() {
        return "NormalRateList{" +
                "normalRate=" + normalRate +
                '}';
    }
}
