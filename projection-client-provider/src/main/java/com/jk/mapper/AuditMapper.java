package com.jk.mapper;

import com.jk.model.Audit;
import com.jk.model.CourseMin;
import com.jk.model.Subject;
import com.jk.model.SubjectCourse;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface AuditMapper {

    long queryTotal();

    List<Audit> queryAudit(@Param("start") int start, @Param("rows")  Integer rows, @Param("audit") Audit audit);

    void deleteAudit(@Param("ids")String ids);

    void updateAppSubject(@Param("id")Integer id, @Param("flag")Integer flag);

    Audit queryByAudit(Integer id);

    void addSubject(Subject su);


    void addScCenter(SubjectCourse sc);


    Integer querySubjectidByName(@Param("name") String auditName);
}
