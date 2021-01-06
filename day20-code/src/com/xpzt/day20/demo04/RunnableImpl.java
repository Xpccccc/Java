package com.xpzt.day20.demo04;

/*
 * 卖票案例出现了线程安全问题
 * 卖出了不存在的票和重复的票
 *
 * 解决线程安全问题的一种方案：使用同步方法
 * 使用步骤：
 *      1.把访问了共享数据的代码抽取出来，放到一个方法中
 *      2.在方法中添加synchronized修饰符
 *
 * 格式：定义方法的格式
 *      修饰符 synchronized 返回值类型 方法名(参数列表){
 *          可能出现安全问题的代码(访问了共享数据的代码)
 *      }
 *
 * */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private static int ticket = 100;

    //设置线程任务：卖票
    @Override
    public void run() {
        System.out.println("this:" + this);//this:com.xpzt.day20.demo03.RunnableImpl@506e1b77
        //使用死循环，让买票操作循环执行
        while (true) {
            payTicketStatic();
        }
    }

    /*
     * 静态的同步方法
     * 锁对象是谁？
     * 不能是this
     * this是创建对象后产生的，静态方法优先于对象
     * 静态方法的锁对象是本类的class属性-->class文件对象(反射)
     * */
    public static synchronized void payTicketStatic() {
        synchronized (RunnableImpl.class) {
            //先判断票是否存在
            if (ticket > 0) {
                //提高线程安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在，卖票 ticket--
                System.out.println(Thread.currentThread().getName() + "-->" + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }

    }
}
