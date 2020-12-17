package com.xpzt.day14.demo03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*java.text.DateFormat是日期/时间格式化子类的抽象类
作用：
    格式化（日期->文本），解析（文本->日期）

成员方法：
    String format(Date date) 按照指定格式，把Date日期，格式化为符合模式的字符串
    Date parse(String source) 把符合模式的字符串，解析为Date日期
DateFormat是一个抽象类，无法直接创建对象，可以用DateFormat类的子类SimpleDateFormat

java.text.SimpleDateFormat extends DateFormat

构造方法：
    SimpleDateFormat(String pattern)
        用给定的模式和默认语言环境的日期格式构造SimpleDateFormat。
模式：区分大小写
        y  年
        M  月
        d  天
        H  时
        m  分
        s  秒
* */
public class Demo01DateFormat {

    public static void main(String[] args) throws ParseException {

        demo01();
        Demo02();
    }


    /*public Date parse(String source) throws ParseException
    * parse声明了一个异常叫ParseException
    * 如果字符串和构造方法的模式不一样，那么程序就会抛出异常*/
    private static void Demo02() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //Date parse(String source) 把符合模式的字符串，解析为Date日期
        Date date = dateFormat.parse("2020年12月17日 11:27:42");
        System.out.println(date);
    }

    private static void demo01() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        String time = dateFormat.format(date);
        System.out.println(date);
        System.out.println(time);

    }
}
