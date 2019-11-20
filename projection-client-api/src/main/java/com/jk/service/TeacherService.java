package com.jk.service;

import com.jk.model.Applica;
import com.jk.model.Teacher;
import com.jk.model.TeacherLv;

import java.util.List;
import java.util.Map;

public interface TeacherService {

    Map<String, Object> queryTeacher(Integer page, Integer rows, Teacher teacher);

    void deleteTeacherByIds(String ids);

    List<TeacherLv> queryTeacherLv();

    Map<String, Object> queryApplication(Integer page, Integer rows, Applica applica);

    void updateAppStatus(Integer id, Integer flag);

    Applica queryByApplica(Integer id);

    void addTeacher(Teacher te);
}
