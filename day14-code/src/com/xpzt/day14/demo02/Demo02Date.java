package com.xpzt.day14.demo02;

import java.util.Date;

public class Demo02Date {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();

    }

    //long getTime() 把日期转换成毫秒值
    //相当于System.currentTimeMillis() -- 获取当前系统时间到1970年08:00:00经历了多少毫秒
    private static void demo03() {
        Date date=new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    //Date类带参数构造方法
    //Date()传递毫秒值，把毫秒值转换为Date日期
    private static void demo02() {
        Date date = new Date(1608131750052L);
        System.out.println(date);
    }

    //Date类的空参数构造方法
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);//获取当前的日期和时间
    }
}
