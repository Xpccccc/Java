package com.xpzt.day10.demo02;

public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();
    public default void methodDefault(){
        System.out.println("默认方法A");
    }
}
