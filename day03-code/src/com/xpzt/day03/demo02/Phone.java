package com.xpzt.day03.demo02;

public class Phone {
    //成员变量
    String brand;//品牌
    double price;
    String color;

    //成员方法
    public void call(String who) {//打电话
        System.out.println("给" + who + "打电话");
    }

    public void sandMessage() {
        System.out.println("群发短信");
    }
}
