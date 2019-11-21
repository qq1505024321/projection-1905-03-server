package com.jk.mapper;

import com.jk.model.Applica;
import com.jk.model.Teacher;
import com.jk.model.TeacherLv;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> queryTeacher(Teacher teacher);

    void deleteTeacherByIds(String ids);

    List<TeacherLv> queryTeacherLv();

    List<Teacher> queryApplication(Applica applica);

    void updateAppStatus(@Param("id") Integer id, @Param("flag")Integer flag);

    Applica queryByApplica(Integer id);

    void addTeacher(Teacher te);

    void deleteTeacherAppById(@Param("ids")String ids);

    List queryTeacherCourse();

}
