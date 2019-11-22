package com.jk.service;

import com.jk.model.Audit;
import com.jk.model.CourseMin;
import com.jk.model.Subject;
import com.jk.model.SubjectCourse;

import java.util.Map;

public interface AuditService {


    Map<String, Object> queryAudit(Audit audit, Integer rows, Integer page);

    void deleteAudit(String ids);

    void updateAppSubject(Integer id, Integer flag);

    Audit queryByAudit(Integer id);

    void addSubject(Subject su);

    void addScCenter(SubjectCourse sc);


    Integer querySubjectidByName(String auditName);
}
