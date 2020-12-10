package com.xpzt.day08.demo05;

public class Demo02Interface {

    public static void main(String[] args) {
        //创建了实现类的对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodDefault();//调用了抽象方法，实际上是调用了右侧实现类
        a.method();

        System.out.println("================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodDefault();
        b.method();
    }
}
