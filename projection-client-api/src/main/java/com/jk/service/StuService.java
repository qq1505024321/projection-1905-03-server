package com.jk.service;

import com.jk.model.Users;

import java.util.Map;

public interface StuService {
    /*查询学生展示*/
    Map<String, Object> queryUser(Integer page, Integer rows, Users user);
    /*删除学生信息*/
    void deleteStuByIds(String ids);
}
