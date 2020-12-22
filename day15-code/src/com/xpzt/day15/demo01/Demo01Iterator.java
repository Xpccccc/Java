package com.xpzt.day15.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *
 * java.util.Iterator接口：迭代器（对集合进行遍历）
 * 有两个常用方法：
 *   boolean hasNext()如果仍有元素可以迭代，则返回true，没有返回false
 *       判断集合中还有没有下一个元素，如果有返回true，没有返回false
 *   E next()返回迭代的下一个元素
 *       取出集合下一个元素
 * Iterator迭代器，是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象
 *   获取实现类的方式比较特殊，Collection接口有一个方法叫iterator(),这个方法返回的就是迭代器的实现类对象
 *   Iterator<E> iterator()返回在此Collection的元素上进行迭代的迭代器
 *
 * 迭代器的使用步骤（重点）：
 *   1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
 *   2.使用Iterator接口中的方法hasNext()判断还有没有下一个元素
 *   3.使用Iterator接口中的方法next()取出下一个元素
 * */
public class Demo01Iterator {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("陈浩");
        coll.add("陈bb");
        coll.add("陈cc");
        coll.add("陈dd");
        coll.add("陈ee");

        /*1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
         * 注意：
         *   Iterator<E>也是有泛型的，迭代器的泛型跟着集合走
         * */
        //接口                    实现类对象
        Iterator<String> it = coll.iterator();//多态

        /*2.使用Iterator接口中的方法hasNext()判断还有没有下一个元素*/
        while (it.hasNext()) {
            //3.使用Iterator接口中的方法next()取出下一个元素
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("================");

        for (Iterator<String> it2 = coll.iterator(); it2.hasNext();/*每次自动向后移一位*/) {
            String str2 = it2.next();
            System.out.println(str2);
        }
    }
}
