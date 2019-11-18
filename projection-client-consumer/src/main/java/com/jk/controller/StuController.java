package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("stu")
public class StuController {
    @Reference
    public StuService stuService;
}
