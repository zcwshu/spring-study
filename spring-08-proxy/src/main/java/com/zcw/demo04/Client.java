package com.zcw.demo04;

import com.zcw.demo02.UserService;
import com.zcw.demo02.UserServiceImpl;

/**
 * @Author: AndrewBar
 * @Date: Created in 21:23 2020/7/21
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);//设置要代理的对象

        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();

    }
}
