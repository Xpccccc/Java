package com.xpzt.day15.demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
 * 是JDK1.5之后出现的新特性
 * Collection<E>extends Iterable<E>:所有单列集合都可以使用增强for循环
 * public interface Iterable<T>实现这个类接口允许对象成为"foreach"语句的目标
 *
 * 增强for循环：用来遍历集合和数组
 *
 * 格式：
 *       for(集合/数组的数据类型 变量名：集合名/数组名){
 *           sout(变量名);
 *       }
 * */
public class Demo03Foreach {

    public static void main(String[] args) {
        demo01();
        System.out.println("======================");
        demo02();
    }

    //使用增强for循环遍历集合
    private static void demo02() {
        /*Collection<E>extends Iterable<E>:所有单列集合都可以使用增强for循环
         * public interface Iterable<T>实现这个类接口允许对象成为"foreach"语句的目标*/
       // ArrayList<String> list = new ArrayList<>();
        Collection<String> list = new ArrayList<>();
        list.add("陈浩");
        list.add("陈aa");
        list.add("陈bb");
        list.add("陈cc");
        list.add("陈dd");
        for (String s : list) {
            System.out.println(s);
        }
    }

    //使用增强for循环遍历数组
    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 6};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
