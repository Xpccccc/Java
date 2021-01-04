package com.xpzt.day19.demo04;

/*
 * public static void sleep(long millis):使当前正在执行的线程以毫秒数暂停(暂时停止执行)
 * 毫秒数结束之后，线程继续执行
 * */
public class Demo01Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            //使用Thread类的sleep方法让程序睡眠1秒
            try {
                Thread.sleep(1000);//暂停一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
