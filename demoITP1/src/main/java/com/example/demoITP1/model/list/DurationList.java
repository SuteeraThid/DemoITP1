package com.example.demoITP1.model.list;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DurationList {
    @JsonProperty("hsDuration")
    private int hsDuration;

    public DurationList() {
    }

    public int getHsDuration() {
        return hsDuration;
    }

    public void setHsDuration(int hsDuration) {
        this.hsDuration = hsDuration;
    }

    @Override
    public String toString() {
        return "DurationList{" +
                "hsDuration=" + hsDuration +
                '}';
    }
}
