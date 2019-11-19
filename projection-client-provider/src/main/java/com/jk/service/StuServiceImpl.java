package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.StuMapper;
import com.jk.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StuServiceImpl implements StuService{
    @Autowired
    public StuMapper stuMapper;

    @Override
    public Map<String, Object> queryUser(Integer page, Integer rows, Users user) {
        Page<Users> userPage = PageHelper.startPage(page,rows);
        List<Users> userList=stuMapper.queryUser(user);
        Map<String, Object> hashMap = new HashMap<String,Object>();
        hashMap.put("total", userPage.getTotal());
        hashMap.put("rows", userList);
        return hashMap;
    }

    @Override
    public void deleteStuByIds(String ids) {
        stuMapper.deleteStuByIds(ids);
    }
}
