package com.zcw.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: AndrewBar
 * @Date: Created in 8:15 2020/7/21
 */
//等价于 <bean id="user" class="com.zcw.pojo.User"/>
// @Component 组件
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
