package com.xpzt.day14.demo04;


import java.util.Calendar;
import java.util.Date;

/*
 * java.util.Calendar类：日历类
 * Calendar是一个抽象类，里面提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR)
 * Calendar 类无法直接创建对象，里边有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
 * static Calendar getInstance（） 使用默认时期和语言环境获得一个日历
 * */
public class Demo01Calendar {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();//多态
        System.out.println(c);
        Date time = c.getTime();
        System.out.println(time);

    }

}
