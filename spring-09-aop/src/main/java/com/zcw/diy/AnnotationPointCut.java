package com.zcw.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: AndrewBar
 * @Date: Created in 8:00 2020/7/22
 */

//使用注解实现AOP
@Aspect  //标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.zcw.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("====方法执行前====");
    }
    @After("execution(* com.zcw.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("====方法执行后====");
    }

    //在环绕增强中,我们可以给定一个参数,代表我们要获取处理切入的点
    @Around("execution(* com.zcw.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        Signature signature = jp.getSignature();//获得签名
        System.out.println("signature" + signature);

        //执行方法
        Object proceed = jp.proceed();

        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
