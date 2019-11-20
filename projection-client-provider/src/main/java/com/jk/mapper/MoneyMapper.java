package com.jk.mapper;

import com.jk.model.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MoneyMapper {

    long getCount(@Param("orders") Orders orders);

    List<Orders> queryTeacherMoney(@Param("orders")Orders orders, @Param("start")Integer start, @Param("rows")Integer rows);
}
