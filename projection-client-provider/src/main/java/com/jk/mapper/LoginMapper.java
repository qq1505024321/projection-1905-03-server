package com.jk.mapper;

import com.jk.model.UserHt;

public interface LoginMapper {
    UserHt queryUserByUsername(String userName);
}
