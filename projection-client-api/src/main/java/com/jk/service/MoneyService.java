package com.jk.service;

import com.jk.model.Orders;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.util.JSON;

import java.util.List;
import java.util.Map;

public interface MoneyService {

    JSONObject queryTeacherMoney(Integer page, Integer rows, Orders orders);

    JSONObject queryPlatformMoney(Integer page, Integer rows, Orders orders);

    List<Map<String, Object>> queryCakeMoney();


}
