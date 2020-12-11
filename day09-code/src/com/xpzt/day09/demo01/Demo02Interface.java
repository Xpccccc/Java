package com.xpzt.day09.demo01;

public class Demo02Interface {

    public static void main(String[] args) {

        MyInterfacePrivateAImpl implA=new MyInterfacePrivateAImpl();

        MyInterfacePrivateA.methodDefault3();
        MyInterfacePrivateA.methodDefault4();

        implA.methodOne();
    }
}
