package lightman.mybatis_generator.controller;

import lightman.mybatis_generator.Test;
import lightman.mybatis_generator.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description ${todo}
 * @Author Administrator
 * @Date 2018/8/11 0011上午 10:45
 */
@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/insert")
    public int insertUser(){
        Test record = new Test();
        record.setValue("123");
        record.setName("wzm");
        return testMapper.insert(record);
    }
}
