package com.xpzt.day19.demo03;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt=new MyThread();
        //1.使用Thread类中的方法setName(名字)
        mt.setName("小强");
        mt.start();

        ////开启多线程
        new MyThread("陈浩").start();

    }
}
