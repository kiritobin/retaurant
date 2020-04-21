package com.idaobin.restaurant.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetSystemTime {

    /**
     * 获取年月日
     * @return
     */
    public static String getNow(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        String date=sdf.format(calendar.getTime());
        return date;
    }

    public static String getTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar calendar = Calendar.getInstance();
        String date=sdf.format(calendar.getTime());
        return date;
    }
}
