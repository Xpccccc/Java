package com.xpzt.day06.demo02;

/*
 *计算-10.8~5.9之间，绝对值大于6或者小于2.1的整数有多少个
 * */
public class Demo04MathPractise {

    public static void main(String[] args) {
        int count = 0;//计数器
        double min = -10.8;
        double max = 5.9;
        for (double i = Math.ceil(min); i < max; i++) {
            double num = Math.abs(i);//用绝对值比较
            if (num > 6 || num < 2.1) {
                System.out.println((int) i);
                count++;
            }
        }
        System.out.println("整数个数为：" + count);

    }
}
