package com.zcw.demo01;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:57 2020/7/21
 */
public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //代理,中介帮房东租房子,但是呢,代理角色会有一些附属操作
        Proxy proxy = new Proxy(host);

        //你不用面对房东,直接找中介即可!
        proxy.rent();
    }
}
