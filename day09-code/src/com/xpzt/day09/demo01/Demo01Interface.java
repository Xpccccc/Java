package com.xpzt.day09.demo01;

public class Demo01Interface {

    public static void main(String[] args) {
        //创建了实现类的对象
        MyInterfaceStaticImpl impl=new MyInterfaceStaticImpl();
        //错误写法
        //impl.methodStatic();

        //直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
