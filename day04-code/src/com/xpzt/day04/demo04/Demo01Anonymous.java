package com.xpzt.day04.demo04;

public class Demo01Anonymous {
    public static void main(String[] args) {
        //匿名对象
        new Person().name="傻逼";//只能用一次
        new Person().showName();//新地址
    }
}
