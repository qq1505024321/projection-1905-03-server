package com.jk.service;

import com.jk.model.Users;

import java.util.Map;

public interface StuService {

    Map<String, Object> queryUser(Integer page, Integer rows, Users user);
}
