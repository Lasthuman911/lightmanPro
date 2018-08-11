package com.lightman.jdbctemp.demo.dao.impl;

import com.lightman.jdbctemp.demo.dao.TestMapper;
import com.lightman.jdbctemp.demo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Description ${todo}
 * @Author Administrator
 * @Date 2018/8/11 0011下午 3:34
 */
@Service
public class TestMapperImpl extends JdbcDaoImpl implements TestMapper {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Test record) {
        String sql = "";
        return 0;
    }

    @Override
    public Test selectByName(String name) {
        String sql = "select * from test where name = ?";

        //不能直接使用
//        return (Test) jdbcTemplate.queryForObject(sql, Test.class, name);

/*        return jdbcTemplate.queryForObject(sql, new RowMapper<Test>() {
            @Override
            public Test mapRow(ResultSet rs, int rowNum) throws SQLException {
                Test roncooUser = new Test();
                roncooUser.setValue(rs.getString("value"));
                roncooUser.setName(rs.getString("name"));
                return roncooUser;
            }
        }, name);
        */
        return queryForObject(sql,Test.class,name);
    }
}
