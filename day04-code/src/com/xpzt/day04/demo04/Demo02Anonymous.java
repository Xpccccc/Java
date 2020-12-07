package com.xpzt.day04.demo04;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //匿名对象作为方法参数和返回值
        methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);

    }

    public static void methodParam(Scanner sc) {
        int a = sc.nextInt();
        System.out.println("输入的是：" + a);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
