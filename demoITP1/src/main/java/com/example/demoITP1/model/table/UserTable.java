package com.example.demoITP1.model.table;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userID;
    @Column(name = " user_name")
    private String userName;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_image")
    private String userImage;
    @Column(name = "user_email")
    private String userEmail;

    public UserTable() {
    }

    public UserTable(int userID, String userName, String userPassword, String userImage, String userEmail) {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userImage = userImage;
        this.userEmail = userEmail;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
