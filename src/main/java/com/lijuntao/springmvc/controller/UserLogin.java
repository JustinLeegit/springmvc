package com.lijuntao.springmvc.controller;

import com.lijuntao.springmvc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.lijuntao.springmvc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserLogin {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView login(String name, String password){
        //String uname = request.getParameter("name");
        //String upassword = request.getParameter("password");
        //用两种方式都行
        ModelAndView modelAndView;
        try {
            //先判断用户名是否为空，是否符合定义的长度、大小写规则
            //如果符合规则，就finduser
            User user = userService.findUser(name,password);
            //System.out.println("------------------" + user.getId());
            //System.out.println("------------------" + user.getName());
            //如果 user.getId()=0
            if(user!=null){
                modelAndView = new ModelAndView("hello");
                modelAndView.addObject("info","密码正确");
                modelAndView.addObject("id",user.getId());
                modelAndView.addObject("name",user.getName());
            }else {
                modelAndView = new ModelAndView("login");
            }

        } catch (Exception e) {
            e.printStackTrace();
            modelAndView = new ModelAndView("login");
            modelAndView.addObject("info","您的账号或密码错误，请输入正确的账号和密码");
        }
        return modelAndView;
    }
}
