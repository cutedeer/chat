package com.centling.chat.services;


import com.centling.chat.domain.User;

/**
 * @author ccq
 * @Description
 * @date 2017/11/28 22:11
 */
public interface UserService {

    public User getUserById(String userid);
    public int updateUser(User user);
}
