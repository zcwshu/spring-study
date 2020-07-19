package com.zcw.pojo;

/**
 * @Author: AndrewBar
 * @Date: Created in 14:52 2020/7/19
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
