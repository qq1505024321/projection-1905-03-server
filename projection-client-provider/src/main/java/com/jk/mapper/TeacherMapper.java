package com.jk.mapper;

import com.jk.model.Teacher;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> queryTeacher(Teacher teacher);

    void deleteTeacherByIds(String ids);
}
