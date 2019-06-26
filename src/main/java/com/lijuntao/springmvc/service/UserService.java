package com.lijuntao.springmvc.service;
import com.lijuntao.springmvc.pojo.User;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface UserService {
    /**
     * @param name
     * @param password
     * @return
     */
    User findUser(String name, String password) ;

    User getUserById(int id);
}



