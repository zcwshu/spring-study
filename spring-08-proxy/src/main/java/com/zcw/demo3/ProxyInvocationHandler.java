package com.zcw.demo3;

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
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){//1.classLoad,2.要代理的接口,3.InvocationHandler
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),this);
    }

    //重写的方法,处理代理实例,并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质,就是使用反射机制实现
        seeHouse();
                                     //代理的接口对象
        Object result = method.invoke(rent,args);
        fare();
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带看房子");
    }

    public void fare(){
        System.out.println("收中介费");
    }
}
