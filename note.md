##beans.xml配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <!--开启注解的支持-->
    <context:annotation-config/>
    
</beans>
```
##常用依赖
```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.7.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
```
##注解说明
####属性如何注入
- 在变量或者set方法上加@Value注解,相当于property
```java
@Component
public class User {

    @Value("赵成伟2")
//    相当于<bean id="user" class="com.zcw.pojo.User">
//        <property name="name" value="赵成伟2"/>
//    </bean>
    public String name;

//    <bean id="user" class="com.zcw.pojo.User">
//            <property name="name" value="赵成伟2"/>
//    </bean>
    @Value("赵成伟2")
    public void setName(String name) {
        this.name = name;
    }
}
```
####自动装配注解
- @Autowired : 自动装配通过类型.名字
    如果Autowired不能唯一自动装配上属性,则需要通过@Qualifier(value = "dog22")
- Nullable 字段标记的注解,说明这个字段可以为null
- @Resource : 先通过名字,再通过类型
####衍生的注解
- @Component : 组件,放在类上,说明这个类被spring管理了,就是bean!
- @Component的几个衍生注解,都代表将某个类注册到Spring中,装配Bean
    - @Repository : Dao层用该注解标注,相当于组件
    - @Service : Service层用该注解标注,相当于组件
    - @Controller : Service层用该注解标注,相当于组件
####作用域
- @Scope("***")
```java
@Scope("prototype")
@Component
public class User {
    public String name;
//    <property name="name" value="赵成伟2"/>
    @Value("赵成伟2")
    public void setName(String name) {
        this.name = name;
    }
}

```
##小结
####xml与注解
- xml更万能,适用于任何场合!维护简单方便
- 注解 不是自己的类使用不了,维护相对复杂!
####xml与注解的最佳实践
- xml用来管理bean
- 注解只负责完成属性注入
- 我们在使用时只需要注意一个问题:必须让注解生效,就需要开启注解支持
```xml
    <!--开启注解的支持-->
    <!--指定扫描的包,该包下的注解会生效-->
    <context:component-scan base-package="com.zcw.pojo"/>
    <context:annotation-config/>
```

