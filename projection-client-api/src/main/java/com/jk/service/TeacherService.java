package com.jk.service;

import com.jk.model.Teacher;

import java.util.Map;

public interface TeacherService {

    Map<String, Object> queryTeacher(Integer page, Integer rows, Teacher teacher);

    void deleteTeacherByIds(String ids);

}
