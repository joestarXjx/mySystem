package com.bjtu.usersys.mapper;

import com.bjtu.usersys.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TestMapper {

    @Select("SELECT * from t")
    List<Test> getAllT();
}
