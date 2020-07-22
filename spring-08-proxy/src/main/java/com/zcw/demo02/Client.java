package com.zcw.demo02;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:39 2020/7/21
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}
