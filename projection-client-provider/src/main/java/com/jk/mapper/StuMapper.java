package com.jk.mapper;

import com.jk.model.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuMapper {
    /*查询学生展示方法*/
    List<Users> queryUser(Users user);
    /*删除学生方法*/
    void deleteStuByIds(@Param("ids") String ids);
}
