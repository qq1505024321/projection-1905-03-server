package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.TeacherMapper;
import com.jk.model.Teacher;
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
}
