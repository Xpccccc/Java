package com.xpzt.day03.demo02;

import java.util.concurrent.Phaser;

public class Demo03PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8838.0;
        one.color = "土豪金";
        return one;
    }
}
