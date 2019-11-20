package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Teacher;
import com.jk.service.TeacherService;
 import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("teacher")
public class TeacherController {
    @Reference
    private TeacherService teacherService;
    /*这是查询老师的信息*/
    @RequestMapping("queryTeacher")
    @ResponseBody
    public Map<String,Object> queryUser(Integer page, Integer rows, Teacher teacher){
        return teacherService.queryTeacher(page,rows,teacher);
    }

    /*这是删除老师的方法*/
    @RequestMapping("deleteTeacherByIds")
    @ResponseBody
    public int deleteTeacherByIds(String ids){
        teacherService.deleteTeacherByIds(ids);
        return 1 ;
    }

}
