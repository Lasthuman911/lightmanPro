package com.lightman.jdbctemp.demo;

import com.lightman.jdbctemp.demo.dao.impl.TestMapperImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    TestMapperImpl testMapper;

    @Test
    public void selectByNameTest(){
       System.out.println(testMapper.selectByName("wzm"));
    }
}
