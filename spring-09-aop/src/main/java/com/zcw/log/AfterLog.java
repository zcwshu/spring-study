package com.zcw.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author: AndrewBar
 * @Date: Created in 21:52 2020/7/21
 */
public class AfterLog implements AfterReturningAdvice {

    //returnValue : 返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法,返回结果为:"+returnValue);
    }
}
