package com.example.demoITP1.model.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "session_ticket")
public class SessionTicTable {
    @Id
    @Column(name = "session_id")
    private String sessionID;
    @Column(name = "client_ticket")
    private String clientTicket;
    @Column(name = "user_id")
    private String userID;
    @Column(name = "session_start")
    private Date sessionStart;
    @Column(name = "session_expire")
    private Date sessionExpire;

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getClientTicket() {
        return clientTicket;
    }

    public void setClientTicket(String clientTicket) {
        this.clientTicket = clientTicket;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Date getSessionStart() {
        return sessionStart;
    }

    public void setSessionStart(Date sessionStart) {
        this.sessionStart = sessionStart;
    }

    public Date getSessionExpire() {
        return sessionExpire;
    }

    public void setSessionExpire(Date sessionExpire) {
        this.sessionExpire = sessionExpire;
    }

    @Override
    public String toString() {
        return "SessionTicTable{" +
                "sessionID='" + sessionID + '\'' +
                ", clientTicket='" + clientTicket + '\'' +
                ", userID='" + userID + '\'' +
                ", sessionStart=" + sessionStart +
                ", sessionExpire=" + sessionExpire +
                '}';
    }
}
