package com.zcw.demo01;
/**
 * @Author: AndrewBar
 * @Date: Created in 9:58 2020/7/21
 */
public class Proxy implements Rent{
    private Host host;//聚合优于继承

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        this.host.rent();
        contract();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fare(){
        System.out.println("中介收中介费");
    }

    //签合同
    public void contract(){
        System.out.println("签租赁合同");
    }
}
