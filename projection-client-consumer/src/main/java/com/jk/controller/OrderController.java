package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Order;
import com.jk.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    @RequestMapping("OrderHighCharts")
    @ResponseBody
    public List<Map<String,Object>> queryOrderBiao(){
        List<Map<String,Object>> mapa =orderService.queryOrderBiao();
        List<Map<String,Object>> map2 =new ArrayList<Map<String,Object>>();
        for (Map<String,Object> map1:mapa) {
            Map<String,Object> map3=new HashMap<>();
            map3.put("name",map1.get("time"));
            map3.put("data",map1.get("count"));
            map2.add(map3);
        }
        return mapa;
    }



    @RequestMapping("queryColumn")
    @ResponseBody
    public Map<String, Object> queryColumn(){
        List<Map<String,Object>> mapa =orderService.queryColumn();
        Map<String,Object> map2 =new HashMap<String,Object>();
        List<Object> data = new ArrayList<>();
        List<Object> time = new ArrayList<>();
        for (Map<String,Object> map1:mapa) {
            data.add(map1.get("money"));
            time.add(map1.get("currentmonth").toString());
        }
        map2.put("time",time);
        map2.put("data",data);
        return map2;
    }


}
