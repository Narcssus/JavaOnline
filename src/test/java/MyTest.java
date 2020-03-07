import com.MyApplication;
import com.dao.service.TmTestSetDaoImpl;
import com.entity.TmTestSet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author : Narcssus
 * @date : 2020/3/3 22:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class MyTest {

    @Autowired
    private TmTestSetDaoImpl tmTestSetDaoImpl;

    @Test
    public void test1(){
        TmTestSet test = new TmTestSet();
        test.setTestId(UUID.randomUUID().toString());
        tmTestSetDaoImpl.insert(test);
    }

}
