package com.xpzt.day01.demo04;

public class Demo01MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 11;
        System.out.println(isSame(a, b));
        System.out.println(isSame((short) 10, (short) 11));
        System.out.println(isSame(22, 22));
        System.out.println(isSame(10L, 10L));


    }

    public static boolean isSame(byte a, byte b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(short a, short b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(int a, int b) {
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        return a == b;
    }
}
