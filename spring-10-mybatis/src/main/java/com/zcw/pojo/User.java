package com.zcw.pojo;

/**
 * @Author: AndrewBar
 * @Date: Created in 8:48 2020/7/22
 */
public class User {
    private int id;
    private String name;
    private String pwd;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
