package com.example.demoITP1.model.list;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuChildList {
    @JsonProperty("menuChildCode")
    private String menuChildCode;
    @JsonProperty("page")
    private String page;
    @JsonProperty("menuChildName")
    private String menuChildName;
    @JsonProperty("menuChildOrder")
    private int menuChildOrder;

    // Constructure
    public MenuChildList() {
    }

    // Getter Setter
    public String getMenuChildCode() {
        return menuChildCode;
    }

    public void setMenuChildCode(String menuChildCode) {
        this.menuChildCode = menuChildCode;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getMenuChildName() {
        return menuChildName;
    }

    public void setMenuChildName(String menuChildName) {
        this.menuChildName = menuChildName;
    }

    public int getMenuChildOrder() {
        return menuChildOrder;
    }

    public void setMenuChildOrder(int menuChildOrder) {
        this.menuChildOrder = menuChildOrder;
    }

    @Override
    public String toString() {
        return "MenuChildList{" +
                "menuChildCode='" + menuChildCode + '\'' +
                ", page='" + page + '\'' +
                ", menuChildName='" + menuChildName + '\'' +
                ", menuChildOrder=" + menuChildOrder +
                '}';
    }
}