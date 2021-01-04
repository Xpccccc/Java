package com.xpzt.day19.demo01;

/*
 * 创建多线程的第一种方式：创建Thread类的子类
 * java.lang.Thread类：是描述线程的类，我们想要实现多线程程序，就必须继承Thread类
 *   1.创建一个Thread类的子类
 *   2.在Thread类的子类中重写Thread类中的run方法，设置线程任务(开辟线程要做什么？)
 *   3.创建Thread类的子类对象
 *   4.调用Thread类的方法start方法，开启新的线程，执行run方法。
 *       void start() 使用该线程开始执行，java虚拟机调用该线程的run方法
 *       结果是两个线程并发地进行；当前线程(main线程)和另一个线程(创建的新线程，执行其run方法)
 *       多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再启动。
 * java程序属于抢占式调度，哪个线程的优先级高，那个线程优先执行，同一个优先级别，随机才选择一个执行
 * */
public class Demo01MyThread {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread mt = new MyThread();
        //4.调用Thread类的方法start方法，开启新的线程，执行run方法。
        mt.start();
//        new MyThread().start();
        //主线程会继续执行主方法中的代码
        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
    }
}
