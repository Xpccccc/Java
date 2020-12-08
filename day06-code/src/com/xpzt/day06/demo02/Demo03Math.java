package com.xpzt.day06.demo02;

public class Demo03Math {

    public static void main(String[] args) {

        //获取绝对值
        System.out.println(Math.abs(-100));
        System.out.println(Math.abs(-10.3));
        System.out.println(Math.abs(22));
        System.out.println("===============");
        //向上取整
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3));
        System.out.println("===============");

        //向下取整
        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(4));
        System.out.println("===============");

        //四舍五入,不带小数点
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(4));
    }
}
