package com.zcw.demo3;

/**
 * @Author: AndrewBar
 * @Date: Created in 13:05 2020/7/21
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色 : 现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理角色,来处理我们要调用的接口对象
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();//调用getProxy自动生成,proxy就是动态生成的
        proxy.rent();
    }
}
