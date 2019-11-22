package com.jk.service;

import com.jk.model.CourseMin;
import com.jk.model.CourseStatusCenter;
import com.jk.model.Subject;
import com.jk.model.SubjectCourse;

import java.util.List;
import java.util.Map;

public interface CourseService {

    Map<String, Object> queryCourse(Subject course, Integer page, Integer rows);

    void deleteSubjectByIds(String ids);

    List<Map<String, Object>> queryTypeList();

    void addSubjectCourse(SubjectCourse sc);

    void addSubjectStatusCenter(CourseStatusCenter csc);
}
