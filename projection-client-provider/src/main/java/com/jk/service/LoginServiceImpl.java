package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.LoginMapper;
import com.jk.model.UserHt;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserHt queryUserByUsername(String userName) {
        return loginMapper.queryUserByUsername(userName);
    }
}
