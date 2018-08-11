package lightman.mybatis_generator;

import lightman.mybatis_generator.dao.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisGeneratorApplicationTests
{

    @Resource
    private TestMapper testMapper;
/*    @Resource
    private TestExample testExample;*/
    @Test
    public void contextLoads() {
    }

    @Test
    public void insertTest(){
     lightman.mybatis_generator.Test record= new lightman.mybatis_generator.Test();
     record.setName("wzm2");
     record.setValue("123");
     testMapper.insert(record);
    }

    @Test
    public void selectTest(){
        TestExample testExample = new TestExample();
        testExample.createCriteria().andNameEqualTo("wzm");
        List<lightman.mybatis_generator.Test> testList  = testMapper.selectByExample(testExample);
        System.out.println(testList.get(0));

    }

}
