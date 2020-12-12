package com.xpzt.day10.demo01;

public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("默认方法BBB");

    }
}
