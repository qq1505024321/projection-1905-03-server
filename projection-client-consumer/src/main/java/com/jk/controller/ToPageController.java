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

    //这是跳前台分类管理
    @RequestMapping("toQueryType")
    public String toQueryType(){
        return "showType";
    }


    //这是跳前台课程目录
    @RequestMapping("toQueryCourse")
    public String toQueryCourse(){
        return "showCourse";
    }


    //这是跳后台科目新增
    @RequestMapping("toAddCourse")
    public String toAddCourse(){
        return "addCourse";
    }


    //这是跳后台科目审核
    @RequestMapping("toCourseApplication")
    public String toCourseApplication(){
        return "showAudit";
    }


    //这是跳后台科目审核
    @RequestMapping("toQueryOrder")
    public String toQueryOrder(){
        return "showOrder";
    }






}
