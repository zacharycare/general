package com.zacharyz.general.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 日期时间工具类
 */
public class TimeUtil {

    /**
     * 返回当前时间。eg : 2018-04-26 11:09:10
     *
     * @return String
     */
    public static String getNow() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(calendar.getTime());
    }

    public static void main(String[] args) {
        System.out.println(getNow());
    }
}
