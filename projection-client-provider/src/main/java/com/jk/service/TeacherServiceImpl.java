package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
}
