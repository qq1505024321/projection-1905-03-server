package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.*;
import com.jk.service.AuditService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

@Controller
public class AuditController {

    @Reference
    private AuditService auditService;


    @RequestMapping("queryAudit")
    @ResponseBody
    public Map<String ,Object> queryAudit(Integer  page, Audit audit, Integer rows){

        Map<String ,Object> map =auditService.queryAudit(audit,rows,page);

        return  map;
    }

    //删除信息
    @RequestMapping("deleteAudit")
    @ResponseBody
    public int deleteAudit(String ids){
        auditService.deleteAudit(ids);
        return 1;
    }

    //修改状态

    /*这是修改审核状态的方法*/
    @RequestMapping("updateAppSubject")
    @ResponseBody
    public int updateAppSubject(Integer id,Integer flag){
        Subject su=new Subject();
        SubjectCourse sc= new SubjectCourse();
        auditService.updateAppSubject(id,flag);

        if(flag==2){
           Audit ap= auditService.queryByAudit(id);

            su.setSubjectName(ap.getAuditName());
            su.setSubjectTime(ap.getAuditTime());
            auditService.addSubject(su);
            Integer subjectid = auditService.querySubjectidByName(ap.getAuditName());

            //中间表
            sc.setSubjuctId(subjectid);
            sc.setCourseId(ap.getCourseAudit());
            auditService.addScCenter(sc);
        }

        return 1 ;
    }


}
