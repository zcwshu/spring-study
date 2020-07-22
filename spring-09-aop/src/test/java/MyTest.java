import com.zcw.service.UserService;
import com.zcw.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: AndrewBar
 * @Date: Created in 22:03 2020/7/21
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是接口 : 注意点   强转必须有继承或者实现
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
