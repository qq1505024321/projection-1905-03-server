package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class ToPageController {

    //这是跳转后台登录页面的方法
    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }

    //这是跳转后台主页面的方法
    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
}
