package com.jk.controller;



import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;

import com.jk.model.Orders;
import com.jk.service.MoneyService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author ccl
 * @create 2019/11/20
 * @since 1.0.0
 */
@Controller
@RequestMapping("money")
public class MoneyController {

    @Reference
    private MoneyService moneyService;

    @RequestMapping("toShowTeacherMoney")
    public String toShow(){
        return "Order/showTeacherMoney";
    }

    @RequestMapping("queryTeacherMoney")
    @ResponseBody
    public JSONObject queryTeacherMoney(Integer page, Integer rows, Orders orders){
          return moneyService.queryTeacherMoney(page,rows,orders);
    }






}