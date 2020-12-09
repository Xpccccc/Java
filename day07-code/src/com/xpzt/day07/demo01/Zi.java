package com.xpzt.day07.demo01;

public class Zi extends Fu {

    int num = 10;

    public void method() {
        int num = 20;
        System.out.println(num);

        System.out.println(this.num);

        System.out.println(super.num);

    }

}
