import com.zcw.dao.UserDaoMysqlImpl;
import com.zcw.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:57 2020/7/19
 */
public class MyTest {
    public static void main(String[] args) {

        //用户实际调用的是业务层,dao层不需要用户操作
        //UserServiceImpl userService = new UserServiceImpl();

        //userService.setUserDao(new UserDaoMysqlImpl());

        //userService.getUser();

        //获取ApplicationContext:拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么,直接get什么
        UserServiceImpl userService = (UserServiceImpl)context.getBean("userService");
        userService.getUser();
    }
}
