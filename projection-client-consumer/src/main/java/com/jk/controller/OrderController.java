package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Order;
import com.jk.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class OrderController {


    @Reference
    private OrderService orderService;

    @RequestMapping("queryOrder")
    @ResponseBody
    public Map<String ,Object> queryOrder(Order order,Integer page ,Integer rows){

        Map<String ,Object> map=orderService.queryOrder(order,page,rows);

         return map;
    }


}
