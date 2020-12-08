package com.xpzt.day06.demo01;

public class Person {

    //当第一次用到本类的时候，静态代码块执行唯一的一次
    static {
        System.out.println("静态代码块执行");
    }

    public Person(){
        System.out.println("构造方法执行");
    }
}
