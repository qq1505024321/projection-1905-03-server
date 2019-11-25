package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Applica;
import com.jk.model.CourseMin;
import com.jk.model.Teacher;
import com.jk.model.TeacherLv;
import com.jk.service.TeacherService;
 import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("teacher")
public class TeacherController {
    @Reference
    private TeacherService teacherService;

    /*这是查询课程的方法*/
    @RequestMapping("queryCourse")
    @ResponseBody
    public List<CourseMin> queryCourse(){
        return teacherService.queryCourse();
    }
    /*这是查询老师的信息*/
    @RequestMapping("queryTeacher")
    @ResponseBody
    public Map<String,Object> queryUser(Integer page, Integer rows, Teacher teacher){
        return teacherService.queryTeacher(page,rows,teacher);
    }


    /*这是查询老师等级的方法*/
    @RequestMapping("queryTeacherLv")
    @ResponseBody
    public List<TeacherLv> queryTeacherLv(){
        return teacherService.queryTeacherLv();
    }

    /*这是查询老师等级的方法*/
    @RequestMapping("queryTeacherCourse")
    @ResponseBody
    public List queryTeacherCourse(){
        return teacherService.queryTeacherCourse();
    }


    /*这是删除老师的方法*/
    @RequestMapping("deleteTeacherByIds")
    @ResponseBody
    public int deleteTeacherByIds(String ids){
        teacherService.deleteTeacherByIds(ids);
        return 1 ;
    }

    /*这是删除老师审核的方法*/
    @RequestMapping("deleteTeacherAppById")
    @ResponseBody
    public int deleteTeacherAppById(String ids){
        teacherService.deleteTeacherAppById(ids);
        return 1 ;
    }

    /*这是查询审核老师的方法*/
    @RequestMapping("queryApplication")
    @ResponseBody
    public Map<String,Object> queryApplication(Integer page, Integer rows, Applica applica){
        return  teacherService.queryApplication(page,rows,applica);
    }


    /*这是修改审核状态的方法*/
    @RequestMapping("updateAppStatus")
    @ResponseBody
    public int updateAppStatus(Integer id,Integer flag){
        Teacher te=new Teacher();
        long num = new Date().getTime();
        teacherService.updateAppStatus(id,flag);
        if(flag==2){
           Applica ap= teacherService.queryByApplica(id);
            te.setTeaName(ap.getTeachername());
            te.setTeaNumber(String.valueOf(num));
            te.setSubjectId(ap.getCourseid());
            te.setTeaShow(ap.getTeachershow());
            te.setCourseCount(0);
            te.setStuCount(0);
            te.setLvId(ap.getTeacherlevelid());
            te.setShenfenzheng(ap.getShenfenzheng());
            te.setIdentityimg(ap.getIdentityimg());
            te.setCourseid(ap.getCourseid());
            te.setTeaPhone(ap.getTeacherphone());
            te.setTeaImg(ap.getTeacherimg());
            teacherService.addTeacher(te);
        }

        return 1 ;
    }



}
