import com.zcw.pojo.User;
import com.zcw.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: AndrewBar
 * @Date: Created in 12:32 2020/7/19
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT user = (UserT)context.getBean("u2");//默认走无参构造创建对象
        user.show();
    }
}
