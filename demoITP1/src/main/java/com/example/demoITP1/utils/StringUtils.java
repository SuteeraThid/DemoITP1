package com.example.demoITP1.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtils {
    public static boolean isNullOREmpty(String str){
        if (str == null || str.isEmpty() || str.equals("null") || str.equals("NULL"))
            return true;
        else
            return false;
    }
    public static Date convertStringToDate(String format, String str) throws Exception{
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.parse(str);
    }
    public static String convertDateToString(String format,Date date) throws Exception{
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }
}
