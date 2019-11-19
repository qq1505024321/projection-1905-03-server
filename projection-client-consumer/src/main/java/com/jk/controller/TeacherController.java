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

    @RequestMapping("queryTeacher")
    @ResponseBody
    public Map<String,Object> queryUser(Integer page, Integer rows, Teacher teacher){
        return teacherService.queryTeacher(page,rows,teacher);
    }
}
