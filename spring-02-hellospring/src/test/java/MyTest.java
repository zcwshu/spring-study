import com.zcw.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:36 2020/7/19
 */
public class MyTest {
    public static void main(String[] args) {
        //获取spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在spring中管理,我们要使用直接去里面取出来即可
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }
}
