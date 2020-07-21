package com.zcw.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @Author: AndrewBar
 * @Date: Created in 20:35 2020/7/19
 */
public class People {
    //@Autowired//可以不用set方法
    @Resource
    private Cat cat;
    @Autowired//自动装配环境比较复杂,可以使用Qualifier(value = "***")去配置,指定一个唯一的bean对象注入
    @Qualifier(value = "dog22")
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
