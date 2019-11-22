package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Types;
import com.jk.service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class TypeController {

    @Reference
    private TypeService  typeService;

    @RequestMapping("queryType")
    @ResponseBody
    public Map<String ,Object> queryType(Integer  page, Types types , Integer rows){

        Map<String ,Object> map =typeService.queryType(types,rows,page);

        return  map;
    }

    //删除信息
    @RequestMapping("deleteClassify")
    @ResponseBody
    public int deleteCalssify(String ids){
        typeService.deleteCalssify(ids);
        return 1;
    }


}
