package com.jk.mapper;

import com.jk.model.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MoneyMapper {

    List<Orders> queryTeacherMoney(@Param("orders")Orders orders, @Param("start")Integer start, @Param("rows")Integer rows);

    List<Orders> queryPlatformMoney(@Param("orders")Orders orders, @Param("start")Integer start, @Param("rows")Integer rows);

    long getTeacherMoneyCount(@Param("orders")Orders orders);

    long getPlatformMoneyCount(@Param("orders")Orders orders);
}
