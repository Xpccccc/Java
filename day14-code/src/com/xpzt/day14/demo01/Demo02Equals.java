package com.xpzt.day14.demo01;

public class Demo02Equals {

    public static void main(String[] args) {

        Object p1 = new Person("陈浩", 20);
        System.out.println(p1);
        Object p2 = new Person("猪比", 22);
        System.out.println(p2);

        //equals
        //基本数据类型：比较的是值
        //引用数据类型：比较的是两个对象的dzz
        boolean b1 = p1.equals(p2);
        System.out.println(b1);
        p1 = p2;
        boolean b2 = p1.equals(p2);
        System.out.println(b2);
    }
}
