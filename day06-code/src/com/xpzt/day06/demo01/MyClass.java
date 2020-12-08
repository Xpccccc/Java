package com.xpzt.day06.demo01;

public class MyClass {

    int num;
    static int numStatic;

    public void method() {
        System.out.println("这是一个普通的成员方法");
        System.out.println("num" + num);
        System.out.println("numStatic" + numStatic);

    }

    //静态不能直接访问费静态
    //静态当中不能用this关键字
    //this代表当前对象，而静态方法通过类名称调用
    public static void methodStatic() {
        System.out.println("这是一个静态方法");
        System.out.println("num" + numStatic);
        // System.out.println("num"+num);

    }
}
