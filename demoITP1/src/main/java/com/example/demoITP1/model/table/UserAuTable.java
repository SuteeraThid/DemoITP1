package com.example.demoITP1.model.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user_authen")
public class UserAuTable {
    @Id
    @Column(name = "user_id")
    private String userID;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_last_signIn")
    private Date userLastSignIn;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getUserLastSignIn() {
        return userLastSignIn;
    }

    public void setUserLastSignIn(Date userLastSignIn) {
        this.userLastSignIn = userLastSignIn;
    }

    @Override
    public String toString() {
        return "UserAuTable{" +
                "userID='" + userID + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userLastSignIn=" + userLastSignIn +
                '}';
    }
}
