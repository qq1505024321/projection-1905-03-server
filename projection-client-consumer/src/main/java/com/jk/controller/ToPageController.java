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

    //这是跳转后台查询学生的方法
    @RequestMapping("toShowStudent")
    public String toShowStudent(){
        return "Student/ShowStudent";
    }

    //这是跳转后台查询教师的方法
    @RequestMapping("toShowTeacher")
    public String toShowTeacher(){
        return "teacher/ShowTeacher";
    }
}
