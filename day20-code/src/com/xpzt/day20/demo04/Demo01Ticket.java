package com.xpzt.day20.demo04;

/*
 * 模拟买票案例
 * 创建3个线程，同时开启，对共享的票进行出售
 * */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        System.out.println("run:" + run);//run:com.xpzt.day20.demo03.RunnableImpl@506e1b77
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        //创建3个线程，同时开启，对共享的票进行出售
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
