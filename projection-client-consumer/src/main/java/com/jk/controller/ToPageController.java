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

    //这是跳转后台审核教师的方法
    @RequestMapping("toShowApplication")
    public String toShowApplication(){
        return "teacher/showApplication";
    }

    //这是跳转后台老师收入页面的方法
    @RequestMapping("toQueryTeacherMoney")
    public String toQueryTeacherMoney(){
        return "Order/showTeacherMoney";
    }

    //这是跳转后台平台收入的方法
    @RequestMapping("toQueryMoney")
    public String toQueryMoney(){
        return "Order/showPlatformMoney";
    }

    //这是跳转广告商的方法
    @RequestMapping("toAdvertising")
    public String toAdvertising(){
        return "showAdvertising";
    }

    //这是跳前图表
    @RequestMapping("toQueryOrderBiao")
    public String toQueryOrderBiao(){
        return "teacher/highcharts";
    }

}
