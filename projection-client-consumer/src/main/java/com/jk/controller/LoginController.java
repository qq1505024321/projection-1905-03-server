package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.UserHt;
import com.jk.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("user")
public class LoginController {
    @Reference
    private LoginService loginService;

    //登录方法
    @RequestMapping("login")
    @ResponseBody
    public String login(UserHt user, HttpServletRequest request){

        //验证账号
        UserHt loginUser = loginService.queryUserByUsername(user.getUserName());
        if(loginUser == null){
            return "1";
        }
        //密码
        if(!loginUser.getUserPwd().equals(user.getUserPwd())){
            return "2";
        }
        request.getSession().setAttribute("user", loginUser);
        return "3";
    }



}
