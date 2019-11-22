package com.jk.service;

import com.jk.model.Order;

import java.util.Map;

public interface OrderService {

    Map<String, Object> queryOrder(Order order, Integer page, Integer rows);

}
