package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.TeacherMapper;
import com.jk.model.Applica;
import com.jk.model.Teacher;
import com.jk.model.TeacherLv;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Map<String, Object> queryTeacher(Integer page, Integer rows, Teacher teacher) {
        Page<Teacher> userPage = PageHelper.startPage(page,rows);
        List<Teacher> userList=teacherMapper.queryTeacher(teacher);
        Map<String, Object> hashMap = new HashMap<String,Object>();
        hashMap.put("total", userPage.getTotal());
        hashMap.put("rows", userList);
        return hashMap;
    }

    @Override
    public void deleteTeacherByIds(String ids) {
        teacherMapper.deleteTeacherByIds(ids);
    }

    @Override
    public List<TeacherLv> queryTeacherLv() {
        return teacherMapper.queryTeacherLv();
    }

    @Override
    public Map<String, Object> queryApplication(Integer page, Integer rows, Applica applica) {
        Page<Teacher> userPage = PageHelper.startPage(page,rows);
        List<Teacher> userList=teacherMapper.queryApplication(applica);
        Map<String, Object> hashMap = new HashMap<String,Object>();
        hashMap.put("total", userPage.getTotal());
        hashMap.put("rows", userList);
        return hashMap;
    }

    @Override
    public void updateAppStatus(Integer id, Integer flag) {
        teacherMapper.updateAppStatus(id,flag);
    }

    @Override
    public Applica queryByApplica(Integer id) {
        return teacherMapper.queryByApplica(id);
    }

    @Override
    public void addTeacher(Teacher te) {
        teacherMapper.addTeacher(te);
    }

    @Override
    public void deleteTeacherAppById(String ids) {
        teacherMapper.deleteTeacherAppById(ids);
    }

    @Override
    public List queryTeacherCourse() {
        return teacherMapper.queryTeacherCourse();
    }
}
