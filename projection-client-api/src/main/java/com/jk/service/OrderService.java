package com.jk.service;

import com.jk.model.Order;

import java.util.List;
import java.util.Map;

public interface OrderService {

    Map<String, Object> queryOrder(Order order, Integer page, Integer rows);

    List<Map<String, Object>> queryOrderBiao();


    List<Map<String, Object>> queryColumn();
}
