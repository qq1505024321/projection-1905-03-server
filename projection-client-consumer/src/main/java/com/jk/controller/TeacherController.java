package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Applica;
import com.jk.model.CourseMin;
import com.jk.model.Teacher;
import com.jk.model.TeacherLv;
import com.jk.service.TeacherService;
import com.jk.util.ExportExcel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
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
    public Map<String,Object> queryTeacher(Integer page, Integer rows, Teacher teacher){
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

    /*这是学生导出*/
    @RequestMapping("exportTeacher")
    public void export(HttpServletResponse response, int page, int rows){
        List<Teacher> list= new ArrayList<Teacher>();
        try {
            Teacher teacher = new Teacher();
            Map<String, Object> stringObjectMap = teacherService.queryTeacher(page, rows, teacher);
            list = (List<Teacher>) stringObjectMap.get("rows");
            //定义表格的标题
            String title ="奔奔在线教育平台老师展示";
            //定义列名
            String[] rowName={"主键","姓名","头像","手机号","课程类型","老师简介","注册时间","开课时间","老师等级"};
            //定义工具类要的数据
            List<Object[]>  dataList = new ArrayList<Object[]>();
            //循环数据把数据存放到 List<Object[]>
            for (Teacher tea:list) {
                Object[] obj=new Object[rowName.length];
                obj[0]=tea.getTeaId();
                obj[1]=tea.getTeaName();
                obj[2]=tea.getTeaImg();
                obj[3]=tea.getTeaPhone();
                obj[4]=tea.getSubName();
                obj[5]=tea.getTeaShow();
                obj[6]=tea.getCreateTime();
                obj[7]=tea.getSubjectTime();
                obj[8]=tea.getTeacherlevel();
                dataList.add(obj);
            }
            ExportExcel exportExcel=new ExportExcel(title,rowName,dataList,response);
            exportExcel.export();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
