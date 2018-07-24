package com.centling.chat.services.impl;


import com.centling.chat.domain.User;
import com.centling.chat.domain.UserExample;
import com.centling.chat.mapper.UserMapper;
import com.centling.chat.services.UserService;

import org.apache.commons.collections4.CollectionUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author ccq
 * @Description
 * @date 2017/11/28 22:12
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(String userId) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUseridEqualTo(userId);
        List<User> users = userMapper.selectByExample(userExample);
        if (CollectionUtils.isNotEmpty(users)){
            return users.get(0);
        }
        return null;
    }

    public int updateUser(User user) {
        int flag = userMapper.updateByPrimaryKeySelective(user);
        return flag;
    }
}
