package com.xpzt.day16.demo03;

import java.util.HashSet;

/*
 * HashSet自定义类型元素
 *
 * Set集合报错元素唯一：
 *   存储的元素（String，Integer.. Student）,必须重写hashCode方法和equals方法
 *
 * 要求：
 *   同名同年龄，视为同一个人，只能存储一次
 * */
public class Demo05HashSetSavePeople {

    public static void main(String[] args) {
        //创建HashSet集合存储People
        HashSet<People> set = new HashSet<>();
        People p1 = new People("陈浩", 11);
        People p2 = new People("陈浩", 11);
        People p3 = new People("陈浩", 12);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1 == p2);//比较的是地址
        System.out.println(p1.equals(p2));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
