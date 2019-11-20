package com.jk.service;

import com.jk.model.Orders;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.util.JSON;

public interface MoneyService {

    JSONObject queryTeacherMoney(Integer page, Integer rows, Orders orders);
}
