package com.lijuntao.springmvc.mapper;
import com.lijuntao.springmvc.pojo.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;


import javax.persistence.Entity;

@Entity
public interface UserMapper {

    User findUser(@Param("name") String name,@Param("password") String password);

    User getUserById(int id);
}