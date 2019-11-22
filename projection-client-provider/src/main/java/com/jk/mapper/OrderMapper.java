package com.jk.mapper;

import com.jk.model.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {


    long queryTotal();

    List<Order> queryOrder(@Param("start") int start, @Param("rows")Integer rows, @Param("order")Order order);
}
