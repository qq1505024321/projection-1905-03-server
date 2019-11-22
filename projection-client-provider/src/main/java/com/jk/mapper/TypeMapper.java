package com.jk.mapper;

import com.jk.model.Types;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeMapper {


    long queryTotal();

    List<Types> queryType(@Param("start") int start, @Param("rows") Integer rows,@Param("types")Types types);

    void deleteCalssify(@Param("ids")String ids);

}
