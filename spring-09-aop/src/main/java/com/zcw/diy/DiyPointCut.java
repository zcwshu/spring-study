package com.zcw.diy;

/**
 * @Author: AndrewBar
 * @Date: Created in 7:42 2020/7/22
 */
public class DiyPointCut {
    public void before(){
        System.out.println("===========方法执行前===========");
    }
    public void after(){
        System.out.println("===========方法执行后===========");
    }
}
