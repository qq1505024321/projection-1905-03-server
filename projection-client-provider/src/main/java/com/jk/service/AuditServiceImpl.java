package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.AuditMapper;
import com.jk.model.Audit;
import com.jk.model.CourseMin;
import com.jk.model.Subject;
import com.jk.model.SubjectCourse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuditServiceImpl implements AuditService {

    @Autowired
    private AuditMapper auditMapper;

    @Override
    public Map<String, Object> queryAudit(Audit audit, Integer rows, Integer page) {
        long total = auditMapper.queryTotal();
        int start = (page-1)*rows;
        List<Audit> list = auditMapper.queryAudit(start,rows,audit);
        Map<String, Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", list);
        return map;
    }

    @Override
    public void deleteAudit(String ids) {
        auditMapper.deleteAudit(ids);
    }

    @Override
    public void updateAppSubject(Integer id, Integer flag) {
        auditMapper.updateAppSubject(id,flag);
    }

    @Override
    public Audit queryByAudit(Integer id) {
        return auditMapper.queryByAudit(id);
    }

    @Override
    public void addSubject(Subject su) {
        auditMapper.addSubject(su);
    }

    @Override
    public void addScCenter(SubjectCourse sc) {
        auditMapper.addScCenter(sc);
    }

    @Override
    public Integer querySubjectidByName(String auditName) {
        return auditMapper.querySubjectidByName(auditName);
    }


}
