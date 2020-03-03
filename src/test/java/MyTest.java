import dao.entity.TestDTO;
import dao.mapper.TestDTOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author : Narcssus
 * @date : 2020/3/3 22:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {

    @Resource
    private TestDTOMapper testDTOMapper;

    @Test
    public void test1(){
        TestDTO test = new TestDTO();
        test.setId(1L);
        test.setTestset("123");
        testDTOMapper.insert(test);
    }

}
