package com.example.demoITP1.model.response;

import com.example.demoITP1.model.list.MenuChildList;
import com.example.demoITP1.model.list.MenuParentList;

import java.util.List;

public class ResponseSignIn extends ResponseCommon {
    private String sessionID;
    private String userName;
    private String userImage;
    private List<MenuParentList> menuParentList;

    public ResponseSignIn() {
    }

    public ResponseSignIn(String userName, String userImage) {
        this.userName = userName;
        this.userImage = userImage;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public List<MenuParentList> getMenuParentList() {
        return menuParentList;
    }

    public void setMenuParentList(List<MenuParentList> menuParentList) {
        this.menuParentList = menuParentList;
    }

    @Override
    public String toString() {
        return "ResponseSignIn{" +
                "ResponseCommon{" +
                "responseCode='" + getResponseCode() + '\'' +
                ", responseStatus='" + getResponseStatus()+ '\'' +
                ", responseMessage='" + getResponseMessage() + '\'' +
                ", serverDateTime=" + getServerDateTime() +
                ", sessionRefCode='" + getSessionID() + '\'' +
                '}'+
                "sessionID='" + sessionID + '\'' +
                ", userName='" + userName + '\'' +
                ", userImage='" + userImage + '\'' +
                ", menuParentList=" + menuParentList +
                '}';
    }
}
