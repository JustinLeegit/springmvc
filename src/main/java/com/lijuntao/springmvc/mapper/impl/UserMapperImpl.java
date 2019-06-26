package com.lijuntao.springmvc.mapper.impl;

import com.lijuntao.springmvc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.lijuntao.springmvc.mapper.UserMapper;


public class UserMapperImpl implements UserMapper{

    @Autowired
    UserMapper userMapper;
    public User findUser(String name,String password){
         return userMapper.findUser(name, password);
    }

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
}

