package com.example.demoITP1.service;

import com.example.demoITP1.model.request.RequestUserDetail;
import com.example.demoITP1.model.request.RequestUserEdit;
import com.example.demoITP1.model.response.ResponseCode;
import com.example.demoITP1.model.response.ResponseUserDetail;
import com.example.demoITP1.model.table.UserAuTable;
import com.example.demoITP1.model.table.UserTable;
import com.example.demoITP1.repository.RepositoryUser;
import com.example.demoITP1.repository.RepositoryUserAuthen;
import com.example.demoITP1.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceSetUser {
    private RepositoryUser repositoryUser;
    private RepositoryUserAuthen repositoryUserAuthen;

    @Autowired
    ServiceUserAuthen serviceUserAuthen;    // เรียกใช้ constructor ของ class นั้น

    @Autowired
    public ServiceSetUser(RepositoryUser repositoryUser, RepositoryUserAuthen repositoryUserAuthen) {
        this.repositoryUser = repositoryUser;
        this.repositoryUserAuthen = repositoryUserAuthen;
    }

    // method userDetail
    public ResponseUserDetail userDetail(RequestUserDetail req){    // ใน () ให้เป็น request เพราะเราจะรับค่าเข้ามา แล้วให้ method เป็นคน response ออก
        // ดังนั้น class ที่ method จะดึงค่ามาจึงเป็น class response
        ResponseUserDetail response = new ResponseUserDetail();
        Optional<UserTable> userInfo = repositoryUser.findById(req.getUserId());
        if(userInfo.isPresent()){   // ถ้ามีค่า
            response.setUserID(userInfo.get().getUserID());         // response แสดงค่าออกเป็น UserID ที่มาจาก UserTable
            response.setUserName(userInfo.get().getUserName());
            response.setUserEmail(userInfo.get().getUserEmail());
            response.setUserPassword(userInfo.get().getUserPassword());
            response.setUserImage(userInfo.get().getUserImage());

        } else {
            response.setError(ResponseCode.SUCCESS_WEB);            //ถ้าไม่มีค่า info จะแสดงอยู่ที่หน้าเว็ปเหมือนเดิม
        }
        return response;    // ลองเช็คการวาง return อีกที
    }
    // method userEdit
    public ResponseCode userEdit(RequestUserEdit req){
        Optional<UserAuTable> userAuthen = repositoryUserAuthen.findById(req.getUserID());
        Optional<UserTable> userInfo = repositoryUser.findById(req.getUserID());
        if (!userAuthen.isPresent() || !userInfo.isPresent()){  // ค่าว่าง
            return ResponseCode.USR0404;    //  จบตรงนี้คือจบเลย ไม่ทำต่อแล้ว
        }
        // แต่ถ้าค่าไม่ว่างจะทำตรงนี้ต้่อ
        //ซึ่งตรงนี้คือให้ User สามารถแก้ไขข้อมูลได้นั่นเอง
        //userInfo get ค่าเข้ามาให้ตัวเอง ซึ่งค่าที่ get เข้ามานั้น มาจากการถูก set โดยค่าที่ถูก set นั้น เป็นค่าที่ get มาอีกทีจาก user
        userInfo.get().setUserName(req.getUserName());
        userInfo.get().setUserEmail(req.getUserEmail());
        userInfo.get().setUserImage(req.getUserImage());
        if (!StringUtils.isNullOREmpty(req.getUserPassword())){
            userAuthen.get().setUserPassword(req.getUserPassword());    // ก็คือการเปลี่ยน password นั่นแหละ แต่มันจะอยู่ในส่วนของ authen อ่ะ
        }

        // พอ user แก้ไขข้อมูลตัวเองเสร็จแล้ว ก็จะทำการ save
        // save
        try{
            repositoryUser.save(userInfo.get());    // save userInfo.get() ที่ถูกเปลี่ยนค่าแล้ว
        }catch (IllegalArgumentException e){
            return ResponseCode.USR0404;
        }

        try{
            repositoryUserAuthen.save(userAuthen.get());
        }catch(IllegalArgumentException e){
            return ResponseCode.USR0404;
        }

        // พอเซฟข้อมูลเสร็จ หรืออาจจะไม่ได้กรอกข้อมูลไรลงไป มันก็จะ return ออกไปที่หน้าเส็ปเดิมให้
        return ResponseCode.SUCCESS_WEB;
    }
}
