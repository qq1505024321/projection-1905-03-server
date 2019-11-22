package com.jk.mapper;

import com.jk.model.CourseMin;
import com.jk.model.CourseStatusCenter;
import com.jk.model.Subject;
import com.jk.model.SubjectCourse;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CourseMapper {

    long queryTotal();

    List<Subject> queryCourse(@Param("start") int start, @Param("rows")Integer rows, @Param("course") Subject course);

    void deleteSubjectByIds(@Param("ids")String ids);

    List<Map<String, Object>> queryTypeList();

    void addSubjectCourse(SubjectCourse sc);

    void addSubjectStatusCenter(CourseStatusCenter csc);
}
