package com.example.demoITP1.controller;


import com.example.demoITP1.model.request.RequestCommon;
import com.example.demoITP1.model.request.RequestSignIn;
import com.example.demoITP1.model.response.ResponseCode;
import com.example.demoITP1.model.response.ResponseCommon;
import com.example.demoITP1.model.response.ResponseSignIn;
import com.example.demoITP1.service.ServiceSessionTicket;
import com.example.demoITP1.service.ServiceSignIn;
import com.example.demoITP1.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/tracking/api")
public class ControllerSignIn {
    private static final Logger logger = LoggerFactory.getLogger(ControllerSignIn.class);
    @Autowired
    private ServiceSignIn serviceSignIn;
    @Autowired
    private ServiceSessionTicket serviceSessionTicket;

    @PostMapping("/SignIn")
    public ResponseEntity signin(@RequestBody RequestSignIn req){
        ResponseSignIn responseSignIn = new ResponseSignIn();
        try{
            logger.debug("----Start Sign In----");
            logger.debug("RequestSignIn:" + req);
            if (StringUtils.isNullOREmpty(req.getUserAgent())){
                responseSignIn.setError(ResponseCode.USERAGENT_IS_EMPTY);
            } else if (StringUtils.isNullOREmpty(req.getSessionID())) {
                responseSignIn.setError(ResponseCode.SESSIONID_IS_EMPTY);
            } else if (StringUtils.isNullOREmpty(req.getActionBy())) {
                responseSignIn.setError(ResponseCode.ACTIONBY_IS_EMPTY);
            } else if (StringUtils.isNullOREmpty(req.getSessionRefCode())) {
                responseSignIn.setError(ResponseCode.SESSIONREFCODE_IS_EMPTY);
            } else if (StringUtils.isNullOREmpty(req.getUserEmail())) {
                responseSignIn.setError(ResponseCode.LG0101);
            } else if (StringUtils.isNullOREmpty(req.getUserPassword())) {
                responseSignIn.setError(ResponseCode.LG0102);
            }else{
                responseSignIn = serviceSignIn.signIn(req);
            }
        }catch (Exception e){                               // try ถ้าเจอ error ก็จะแสดงตามนั้น แต่ถ้าเจอ error ที่ไม่รู้ว่ามาจากไหนหรือนอกเหนือจากนั้น มันก็จะ catch ตรงนี้
            logger.debug("error :" + e.getMessage());       // getMessage() ใช้ throw ออก
            logger.debug("error : Exception");
            responseSignIn.setError(ResponseCode.UNKNOWN_ERROR);
            responseSignIn.setServerDateTime(LocalDateTime.now());      // บอกเวลาว่ามันพังเอาตอนไหน
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }finally {
            logger.debug("----end Sign In----");
        }
        return null;
    }

    @PostMapping("/signout")
    public ResponseEntity signout(@RequestBody RequestCommon req){      // req ก็จะเป็นพวก UserAgent SessionID ActionBy SessionRefCode
        ResponseCommon responseCommon = new ResponseCommon();
        try {
            logger.debug("----Start Sign Out----");
            logger.debug("RequestSignOut:" + req);      // "RequestSignOut" = RequestCommon เรามโนชื่อมันขึ้นมา
            ResponseCode resSession = serviceSessionTicket.checkRequestCommon(req);     //รับ req เข้ามาว่าไร
            if (resSession != null){
                responseCommon.setError(resSession);    // ถ้า resSession ไม่เป็นค่าว่าง ก็ให้ responseCommon = resSession นั้น
            } else {
                serviceSignIn.signOut(req);
                responseCommon.setError(ResponseCode.SUCCESS_WEB);  // ถ้า resSession เป็นค่าว่าง ก็ยังไห้อยู่ในหน้าเว็ปต่อไป
            }
            responseCommon.setServerDateTime(LocalDateTime.now());
            logger.debug("Response : " + responseCommon);
            return new ResponseEntity(responseCommon, HttpStatus.OK);
        }catch (Exception e){
            logger.debug("error :" + e.getMessage());       // getMessage() ใช้ throw ออก
            logger.debug("error : Exception");
            responseCommon.setError(ResponseCode.UNKNOWN_ERROR);
            responseCommon.setServerDateTime(LocalDateTime.now());
            return new ResponseEntity(responseCommon, HttpStatus.BAD_REQUEST);
        }finally {
            logger.debug("----Start Sign Out----");
        }
    }
}
