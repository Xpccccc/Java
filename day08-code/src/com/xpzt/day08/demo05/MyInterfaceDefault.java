package com.xpzt.day08.demo05;

public interface MyInterfaceDefault {

    public abstract void method();

    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
