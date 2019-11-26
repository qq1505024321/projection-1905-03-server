package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.MoneyMapper;
import com.jk.model.Orders;
import com.jk.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author ccl
 * @create 2019/11/20
 * @since 1.0.0
 */
@Service
public class MoneyServiceImpl implements  MoneyService{

    @Autowired
    private MoneyMapper moneyMapper;

    @Override
    public JSONObject queryTeacherMoney(Integer page, Integer rows, Orders orders) {
        long total = moneyMapper.getTeacherMoneyCount(orders);
        Integer start = (page-1)*rows;
        JSONObject json = new JSONObject();
        List<Orders> bookList = moneyMapper.queryTeacherMoney(orders,start,rows);
        json.put("total", total);
        json.put("rows", bookList);
        return json;
    }

    @Override
    public JSONObject queryPlatformMoney(Integer page, Integer rows, Orders orders) {
        long total = moneyMapper.getPlatformMoneyCount(orders);
        Integer start = (page-1)*rows;
        JSONObject json = new JSONObject();
        List<Orders> bookList = moneyMapper.queryPlatformMoney(orders,start,rows);
        json.put("total", total);
        json.put("rows", bookList);
        return json;
    }

    @Override
    public List<Map<String, Object>> queryCakeMoney() {
        return moneyMapper.queryCakeMoney();
    }

}