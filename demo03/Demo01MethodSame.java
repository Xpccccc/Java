package com.xpzt.day01.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(same(10, 10));
        System.out.println(same(20, 10));
    }

    public static boolean same(int a, int b) {
        return a == b;
    }
}
