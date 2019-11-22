package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.CourseStatusCenter;
import com.jk.model.Subject;
import com.jk.model.SubjectCourse;
import com.jk.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class CourseController {

    @Reference
    private CourseService courseService;


    @RequestMapping("queryCourse")
    @ResponseBody
    public Map<String , Object> queryCourse(Subject course, Integer page, Integer rows){
        Map<String , Object> map= courseService.queryCourse(course,page,rows);
        return map;
    }

       //新增信息
    @RequestMapping("addCourse")
    @ResponseBody
    public String addCourse(Subject subject){

        //新增课程和课程目录中间表
        SubjectCourse sc = new SubjectCourse();
        sc.setCourseId(subject.getSubId());
        sc.setSubjuctId(subject.getSubjectId());
        courseService.addSubjectCourse(sc);
        //新增课程目录和课程目录状态中间表
        CourseStatusCenter csc = new CourseStatusCenter();
        csc.setCouseid(subject.getSubId());
        csc.setStatusid(subject.getCourseTypeId());
        courseService.addSubjectStatusCenter(csc);

        return "1";
    }

    //新增状态回显
    @RequestMapping ("queryTypeList")
    @ResponseBody
    public List<Map<String,Object>> queryTypeList(){

      return   courseService.queryTypeList();
    }


    //删除信息
    @RequestMapping("deleteSubjectByIds")
    @ResponseBody
    public int deleteSubjectByIds(String ids){
        courseService.deleteSubjectByIds(ids);
        return 1;
    }




}
