package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.CourseMapper;
import com.jk.model.CourseMin;
import com.jk.model.CourseStatusCenter;
import com.jk.model.Subject;
import com.jk.model.SubjectCourse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Map<String, Object> queryCourse(Subject course, Integer page, Integer rows) {
        long total = courseMapper.queryTotal();
        int start = (page-1)*rows;
        List<Subject> list = courseMapper.queryCourse(start,rows,course);
        Map<String, Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", list);
        return map;
    }


    @Override
    public void deleteSubjectByIds(String ids) {
        courseMapper.deleteSubjectByIds(ids);
    }

    @Override
    public List<Map<String, Object>> queryTypeList() {
        return courseMapper.queryTypeList();
    }


    @Override
    public void addSubjectCourse(SubjectCourse sc) {
        courseMapper.addSubjectCourse(sc);
    }

    @Override
    public void addSubjectStatusCenter(CourseStatusCenter csc) {
        courseMapper.addSubjectStatusCenter(csc);
    }


}
