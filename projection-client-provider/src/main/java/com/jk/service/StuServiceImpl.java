package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StuServiceImpl implements StuService{
    @Autowired
    public StuMapper stuMapper;
}
