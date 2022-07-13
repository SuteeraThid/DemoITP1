package com.example.demoITP1.model.list;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MenuParentList {
    @JsonProperty("menuParentCode")
    private String menuParentCode;
    @JsonProperty("page")
    private String page;
    @JsonProperty("menuParentName")
    private String menuParentName;
    @JsonProperty("menuParentOrder")
    private int menuParentOrder;
    @JsonProperty("menuChildList")
    private List<MenuChildList> menuChildList;

    // Constructure
    // แม้จะไม่มีอะไรในวงเล็บ ก็ยังคงต้องประกาศเป็น Constructure เหมือนเดิม เพื่อที่จะเอาไปทำเป็น list
    public MenuParentList(){

    }

    // getter setter
    public String getMenuParentCode() {
        return menuParentCode;
    }

    public void setMenuParentCode(String menuParentCode) {
        this.menuParentCode = menuParentCode;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getMenuParentName() {
        return menuParentName;
    }

    public void setMenuParentName(String menuParentName) {
        this.menuParentName = menuParentName;
    }

    public int getMenuParentOrder() {
        return menuParentOrder;
    }

    public void setMenuParentOrder(int menuParentOrder) {
        this.menuParentOrder = menuParentOrder;
    }

    public List<MenuChildList> getMenuChildList() {
        return menuChildList;
    }

    public void setMenuChildList(List<MenuChildList> menuChildList) {
        this.menuChildList = menuChildList;
    }

    @Override
    public String toString() {
        return "MenuParentList{" +
                "menuParentCode='" + menuParentCode + '\'' +
                ", page='" + page + '\'' +
                ", menuParentName='" + menuParentName + '\'' +
                ", menuParentOrder=" + menuParentOrder +
                ", menuChildList=" + menuChildList +
                '}';
    }
}
