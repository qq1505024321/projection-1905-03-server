package com.jk.service;

import com.jk.model.UserHt;

public interface LoginService {
    UserHt queryUserByUsername(String userName);

}
