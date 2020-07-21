package com.zcw.ZcwConfig;

import com.zcw.pojo.User;
import com.zcw.pojo.ZcwConfig2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:04 2020/7/21
 */

@Configuration
//这个也会被spring容器托管,注册到容器中,因为他本本来就是个@component
// @configuration代表这是一个配置类,就和我们之前看到的beans.xml一样
@ComponentScan("com.zcw")
@Import(ZcwConfig2.class)
public class ZcwConfig {

    //注册一个bean,就相当于我们之前写的一个标签
    //这个方法名字,就相当于bean标签的id属性
    //这个方法的返回值,就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean 的对象
    }
}
