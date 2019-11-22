package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.TypeMapper;
import com.jk.model.Types;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class TypeServiceImpl implements TypeService{

     @Autowired
     private  TypeMapper typeMapper;

    @Override
    public Map<String, Object> queryType(Types types, Integer rows, Integer page) {
        long total = typeMapper.queryTotal();
        int start = (page-1)*rows;
        List<Types> list = typeMapper.queryType(start,rows,types);
        Map<String, Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", list);
        return map;
    }

    @Override
    public void deleteCalssify(String ids) {
        typeMapper.deleteCalssify(ids);
    }
}
