package com.lijuntao.springmvc.service.impl;

import com.lijuntao.springmvc.mapper.UserMapper;
import com.lijuntao.springmvc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.lijuntao.springmvc.service.UserService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper usi;

    public User findUser(String name, String password)  {
        boolean flag = checkString(name,1,10)&&checkString(password,1,10);
        if (!flag)
            return null;
        return usi.findUser(name,password);
    }
    private boolean checkString(String str,int minL,int maxL){
        return str!=null&&str.length()>=minL&&str.length()<=maxL;
    }

    public User getUserById(int id) {

        return usi.getUserById(id);
    }
}





