package com.example.demoITP1.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {

    // แปลงจาก string เป็น date
    public static Date convertStringToDate(String format, String str) throws Exception{
        if (!StringUtils.isNullOREmpty(str)) {  // ถ้า str ค่าไม่ว่าง
            SimpleDateFormat formatter = new SimpleDateFormat(format);  //ก็แปลง
            return formatter.parse(str);
        } else {
            return null;
        }
    }

    // เปลี่ยน Date เป็น String
    public static String convertDateToString(String format, Date date) throws Exception{
        if (null != date){
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            return formatter.format(date);
        } else {
            return "";
        }
    }

    public static Date removeDate(Date date,int num){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,num);
        return calendar.getTime();
    }

    public static Date addMinute(Date date,int num){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE,num);
        return calendar.getTime();
    }

    public static Date addSecond(Date date,int num){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND,num);
        return calendar.getTime();
    }

    public static Date getLastTimeOfDay(Date sysdate){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysdate);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    public static Date getFirstTimeOfDay(Date sysdate){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sysdate);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date getDateWithoutTime(Date oldDate){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(oldDate);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

}
