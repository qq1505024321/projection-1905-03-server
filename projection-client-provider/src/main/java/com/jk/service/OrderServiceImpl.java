package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.OrderMapper;
import com.jk.model.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements  OrderService{

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public Map<String, Object> queryOrder(Order order, Integer page, Integer rows) {
        long total = orderMapper.queryTotal();
        int start = (page-1)*rows;
        List<Order> list = orderMapper.queryOrder(start,rows,order);
        Map<String, Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", list);
        return map;
    }
}
