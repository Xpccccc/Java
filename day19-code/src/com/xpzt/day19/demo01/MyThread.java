package com.xpzt.day19.demo01;

/*
 * 1.创建一个Thread类的子类
 * */
public class MyThread extends Thread {
    //2.在Thread类的子类中重写Thread类中的run方法，设置线程任务(开辟线程要做什么？)

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + i);
        }
    }

}
