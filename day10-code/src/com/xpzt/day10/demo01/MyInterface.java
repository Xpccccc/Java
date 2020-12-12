package com.xpzt.day10.demo01;

public interface MyInterface {

    public static final int NUM_AGE = 21;//成员变量 -- 就是接口常量

    public default void method() {
        System.out.println("接口默认方法");
    }
}
