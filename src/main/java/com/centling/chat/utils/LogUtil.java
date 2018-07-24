package com.centling.chat.utils;


import com.centling.chat.domain.Log;


public class LogUtil {

    public static Log setLog(String userId, String time, String type, String detail, String ip){
        Log log = new Log();
        log.setUserid(userId);
        log.setDetail(detail);
        log.setTime(time);
        log.setIp(ip);
        log.setType(type);
        return log;
    }
}
