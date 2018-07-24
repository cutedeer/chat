package com.centling.chat.services;


import com.centling.chat.domain.Log;
import com.centling.chat.utils.PageBean;


public interface LogService {

    public void insertLog(Log log);

    public PageBean<Log> selectLogByUserid(String userid, int page, int pageSize);

}
