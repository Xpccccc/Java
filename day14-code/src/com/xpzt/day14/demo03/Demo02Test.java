package com.xpzt.day14.demo03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*使用日期时间相关的API,计算一个人出生了多少天


 * */
public class Demo02Test {

    public static void main(String[] args) throws ParseException {
        //1.使用Scanner获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期,格式为yyyy-MM-dd");
        String birthdayDateString = sc.next();
        //2.使用DateFormat类的parse方法，把字符串的出生日期，解析为Date格式的出生日期
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = df.parse(birthdayDateString);
        //3.把Date格式的出生日期转换成毫秒值
        long birdayDateTime = birthdayDate.getTime();
        //4.获取当前日期，转换成毫秒值
        long todayTime = new Date().getTime();
        //5.毫秒值相减
        long time = todayTime - birdayDateTime;
        System.out.println(time/1000/60/60/24);


    }
}
