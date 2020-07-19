package com.zcw.pojo;

/**
 * @Author: AndrewBar
 * @Date: Created in 11:11 2020/7/19
 */
public class User {
    private String name;

    public User() {
    }

//    public User(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name=" + name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
