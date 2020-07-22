import com.zcw.mapper.UserMapper;
import com.zcw.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: AndrewBar
 * @Date: Created in 11:07 2020/7/22
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<User> userList = userMapper.selectUser();

        for (User user : userList) {
            System.out.println(user);
        }

    }
}
