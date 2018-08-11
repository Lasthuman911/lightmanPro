package com.lightman.jdbctemp.demo.dao;

import com.lightman.jdbctemp.demo.entity.Test;

import java.util.List;


public interface TestMapper {
    int insert(Test record);

    Test selectByName(String name);

}