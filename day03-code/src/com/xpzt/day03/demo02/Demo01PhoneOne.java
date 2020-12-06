package com.xpzt.day03.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one=new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("============");

        one.call("乔布斯");
        one.sandMessage();
    }
}
