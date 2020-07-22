package com.zcw.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: AndrewBar
 * @Date: Created in 12:57 2020/7/21
 */
//InvocationHandler : 调用处理程序
    //我们会用这个类生成代理角色
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){//1.classLoad,2.要代理的接口,3.InvocationHandler
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    //重写的方法,处理代理实例,并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target,args);
        return result;
    }

    //增加功能
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
