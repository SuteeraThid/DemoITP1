package com.example.demoITP1.controller;

import com.example.demoITP1.model.request.RequestUserDetail;
import com.example.demoITP1.model.request.RequestUserEdit;
import com.example.demoITP1.model.response.ResponseCode;
import com.example.demoITP1.model.response.ResponseCommon;
import com.example.demoITP1.model.response.ResponseUserDetail;
import com.example.demoITP1.service.ServiceSessionTicket;
import com.example.demoITP1.service.ServiceSetUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/tracking/api/set")
public class ControllerSetUser {
    private static final Logger logger = LoggerFactory.getLogger(ControllerSetUser.class);
    @Autowired
    private ServiceSessionTicket serviceSessionTicket;
    @Autowired
    private ServiceSetUser serviceSetUser;

    @PostMapping("/userDetail")
    public ResponseEntity userDetail(RequestUserDetail req){
        ResponseUserDetail response = new ResponseUserDetail();
        try{
            logger.debug("----Start UserDetail----");
            logger.debug("RequestUserDetail:" + req);
            ResponseCode resSession = serviceSessionTicket.checkRequestCommon(req);     // เพราะพวก requestCommon มันจะมีค่าของพวกที่ sign in เข้ามา

            // เช็คทุกอัน
            if (resSession != null){                        // มีค่าภายใน
                response.setError(resSession);              //  ให้แสดงค่า response = resSession
            } else if (null == req.getUserId()) {           // หรือถ้า ว่าง จะให้เท่ากับ userID
                response.setError(ResponseCode.USR0201);    // return ออกมาเป็น fail
            } else {
                response = serviceSetUser.userDetail(req);  // ถ้าค่าว่าง ก็ให้ออกเป็น method userDetail
            }

            // จากนั้นให้ทำ
            response.setServerDateTime(LocalDateTime.now());
            logger.debug("Response : " + response);
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e){
            logger.debug("error :" + e.getMessage());       // getMessage() ใช้ throw ออก
            logger.debug("error : Exception");
            response.setError(ResponseCode.UNKNOWN_ERROR);
            response.setServerDateTime(LocalDateTime.now());
            return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
        } finally {
            logger.debug("----end userDetail----");
        }
    }

    @PostMapping("/userEdit")
    public ResponseEntity userEdit(RequestUserEdit req){
        ResponseCommon response = new ResponseCommon();
        try{
            logger.debug("----Start UserEdit----");
            logger.debug("RequestUserEdit:" + req);
            ResponseCode resSession = serviceSessionTicket.checkRequestCommon(req);

            // เช็คทุกอัน
            if (resSession != null){                        // มีค่าภายใน
                response.setError(resSession);              //  ให้แสดงค่า response = resSession
            } else if (null == req.getUserID()) {           // หรือถ้า ว่าง จะให้เท่ากับ userID
                response.setError(ResponseCode.USR0401);    // return ออกมาเป็น fail
            } else {
                response.setError(serviceSetUser.userEdit(req));  // ถ้าค่าว่าง ก็ให้ออกเป็น method userEdit
            }
            response.setServerDateTime(LocalDateTime.now());
            logger.debug("Response : " + response);
            return new ResponseEntity(response, HttpStatus.OK);
        }catch (Exception e) {
            logger.debug("error :" + e.getMessage());       // getMessage() ใช้ throw ออก
            logger.debug("error : Exception");
            response.setError(ResponseCode.UNKNOWN_ERROR);
            response.setServerDateTime(LocalDateTime.now());
            return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
        } finally {
            logger.debug("----end userEdit----");
        }
    }
}
