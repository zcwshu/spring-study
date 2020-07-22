package com.zcw.service;

/**
 * @Author: AndrewBar
 * @Date: Created in 21:45 2020/7/21
 */
public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void select() {
        System.out.println("查看了一个用户");
    }
}
