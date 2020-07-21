import com.zcw.ZcwConfig.ZcwConfig;
import com.zcw.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:06 2020/7/21
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做,我们就只能通过 AnnotationConfig 上下文来获取容器,通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(ZcwConfig.class);
        User getUser = context.getBean("getUser", User.class);//方法名 = bean
        System.out.println(getUser.getName());
    }
}
