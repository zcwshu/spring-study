package com.zcw.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: AndrewBar
 * @Date: Created in 21:47 2020/7/21
 */
public class Log implements MethodBeforeAdvice {

    //method : 要执行的目标对象的方法
    //object : 参数
    //target : 目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
