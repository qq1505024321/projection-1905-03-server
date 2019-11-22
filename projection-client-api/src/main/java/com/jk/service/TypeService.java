package com.jk.service;

import com.jk.model.Types;

import java.util.Map;

public interface TypeService {


    Map<String, Object> queryType(Types types, Integer rows, Integer page);

    void deleteCalssify(String ids);
}
