package com.zcw.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:02 2020/7/21
 */
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("赵成伟")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
