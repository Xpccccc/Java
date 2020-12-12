package com.xpzt.day10.demo02;

//这个子接口有4个方法
public interface MyInterface extends MyInterfaceA,MyInterfaceB{

    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println();
    }
}
