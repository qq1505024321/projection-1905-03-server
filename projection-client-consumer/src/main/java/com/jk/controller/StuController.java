package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Users;
import com.jk.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("stu")
public class StuController {
    @Reference
    public StuService stuService;
    /*这是查询学生展示的方法*/
    @RequestMapping("queryUser")
    @ResponseBody
    public Map<String,Object> queryUser(Integer page, Integer rows, Users user){
        return stuService.queryUser(page,rows,user);
    }
    /*这是删除学生的方法*/
    @RequestMapping("deleteStuByIds")
    @ResponseBody
    public void deleteStuByIds(String ids){
        stuService.deleteStuByIds(ids);
    }
}
