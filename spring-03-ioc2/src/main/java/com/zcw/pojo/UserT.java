package com.zcw.pojo;

/**
 * @Author: AndrewBar
 * @Date: Created in 12:54 2020/7/19
 */
public class UserT {

    private String name;

    public UserT() {
        System.out.println("USerT被创建");
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
