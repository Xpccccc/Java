package com.xpzt.day10.demo01;

public class MyInterfaceImpl /* extends Object*/ implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A抽象方法");
    }


    @Override
    public void methodB() {
        System.out.println("覆盖重写了B抽象方法");

    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB都有的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中的默认方法进行了覆盖重写");
    }
}
