package com.zcw.pojo;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:31 2020/7/19
 */
public class Hello {

    private String str;

    public String getStr() {
        return str;
    }

    //依赖注入
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
