import com.MyApplication;
import com.dao.entity.TestDTO;
import com.dao.mapper.TestDTOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author : Narcssus
 * @date : 2020/3/3 22:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class MyTest {

    @Resource
    private TestDTOMapper testDTOMapper;

    @Test
    public void test1(){
        TestDTO test = new TestDTO();
        test.setId(2L);
        test.setTestset("123");
        testDTOMapper.insert(test);
    }

}
