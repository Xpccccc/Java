package com.xpzt.day05.demo01;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(3);//  [0,3)
            System.out.println("随机数：" + num);

        }
    }
}
