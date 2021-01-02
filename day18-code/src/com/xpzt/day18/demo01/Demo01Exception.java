package com.xpzt.day18.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.lang.Throwable类：是java语言中所有错误或异常的超类
 *   Exception:编译期异常，进行编译（写代码）java程序出现的问题
 *       RuntimeException运行期异常，java程序运行期间出现的问题
 *       异常就相当于程序得了一个小毛病(感冒，发烧)，把异常处理掉，程序就可以继续运行，(吃点药，继续革命工作)
 *   Error:错误
 *       错误就相当于程序得了一个无法治愈的病(艾滋)，必须修改源代码，程序才能继续运行
 * */
public class Demo01Exception {

    public static void main(String[] args) /*throws ParseException*/ {
        //Exception:编译期异常，进行编译（写代码）java程序出现的问题
        /*SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");//用来格式化日期
        Date date = null;//把字符串格式的日期，解析为Date格式的日期
        try {
            date = sdf.parse("1999-1114");//把字符串格式的日期，解析为Date格式的日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/

        //RuntimeException运行期异常，java程序运行期间出现的问题
        /*int[] arr={1,2,3};
        try {
            //可能出现异常的代码
            System.out.println(arr[3]);
        }catch (Exception e){
            //异常的处理逻辑
            System.out.println(e);
        }*/

        /*
        * Error：错误
        * OutOfMemoryError: Java heap space
        * 内存溢出的错误，创建的数组太大了，超出了JVM分配的内存
        * */

        //int[] arr=new int[1024*1024*1024];
        //必须修改代码，创建的数组小一点
        int[] arr=new int[1024*1024];
        System.out.println("后续代码");
    }
}
