package com.example.demoITP1.service;


import com.example.demoITP1.model.request.RequestCommon;
import com.example.demoITP1.model.response.ResponseCode;
import com.example.demoITP1.model.table.SessionTicTable;
import com.example.demoITP1.repository.RepositorySessionTicket;
import com.example.demoITP1.utils.CommonData;
import com.example.demoITP1.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;
@Service
public class ServiceSessionTicket {
    private static final Logger logger = LoggerFactory.getLogger(ServiceSignIn.class);
    private RepositorySessionTicket repositorySessionTicket;

    @Autowired
    private ServiceSystemConfig serviceSystemConfig;

    // Constructor ของตัวเองเผื่อไว้ใช้ใน class อื่น
    @Autowired
    public ServiceSessionTicket(RepositorySessionTicket repositorySessionTicket) {
        this.repositorySessionTicket = repositorySessionTicket;
    }

    // Method for ดึง Session Ticket
    public Optional<SessionTicTable> retrieveSessionTicket(String sessionID){
        return repositorySessionTicket.findById(sessionID);
    }

    // Method ไว้เช็ค RequestCommon
    public ResponseCode checkRequestCommon(RequestCommon req){
        if (StringUtils.isNullOREmpty(req.getUserAgent())) {
            return ResponseCode.USERAGENT_IS_EMPTY;
        } else if (StringUtils.isNullOREmpty(req.getSessionID())) {
            return ResponseCode.SESSIONID_IS_EMPTY;
        } else if (StringUtils.isNullOREmpty(req.getActionBy())) {
            return ResponseCode.ACTIONBY_IS_EMPTY;
        } else if (StringUtils.isNullOREmpty(req.getSessionRefCode())) {
            return ResponseCode.SESSIONREFCODE_IS_EMPTY;
        } else {
            Optional<SessionTicTable> sessionTicket = repositorySessionTicket.findById(req.getSessionID());
            if (sessionTicket.isPresent()){
                if(sessionTicket.get().getSessionExpire().before(new Date())){
                    return ResponseCode.SESSIONID_EXPIRE;
                } else {
                    int apiTimeOut = Integer.parseInt(serviceSystemConfig.retrieveSystemConfig(CommonData.CONTEXT_DATA_WEB, CommonData.CONTEXT_NAME_API_TIME_OUT));
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(Calendar.SECOND, apiTimeOut);
                    Date expDate = calendar.getTime();
                    sessionTicket.get().setSessionExpire(expDate);
                    repositorySessionTicket.save(sessionTicket.get());
                    return null;
                }
            }else {
                return ResponseCode.SESSIONID_NOT_FOUND;
            }
        }

    }
    public void deleteSession(String sessionID){repositorySessionTicket.deleteById(sessionID);
    }
    public boolean isDuplicateSessionId(String sessionId){
        Optional<SessionTicTable> sessionTicket = repositorySessionTicket.findById(sessionId);
        return sessionTicket.isPresent();
    }

    //method เอาไส้สร้าง SessionTicket
    public String generateSessionTicket(String userId){
        String uniqueID = UUID.randomUUID().toString();
        while (isDuplicateSessionId(uniqueID)) {
            uniqueID = UUID.randomUUID().toString();
        }
        int apiTimeOut = Integer.parseInt(serviceSystemConfig.retrieveSystemConfig(CommonData.CONTEXT_DATA_WEB, CommonData.CONTEXT_NAME_API_TIME_OUT));
        Calendar calendar = Calendar.getInstance();
        Date sysDate = calendar.getTime();
        calendar.add(Calendar.SECOND, apiTimeOut);
        Date expDate = calendar.getTime();
        SessionTicTable sessionTicket = new SessionTicTable();
        sessionTicket.setSessionID(uniqueID);
        sessionTicket.setClientTicket("web");
        sessionTicket.setUserID(userId);
        sessionTicket.setSessionStart(sysDate);
        sessionTicket.setSessionExpire(expDate);
        repositorySessionTicket.save(sessionTicket);
        return uniqueID;
    }
}

