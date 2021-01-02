package com.xpzt.day18.demo02;

/*
 * 如果finally有return语句，永远返回finally中的结果，尽量避免该情况
 * */
public class Demo02Exception {

    public static void main(String[] args) {
        System.out.println(getA());
    }

    //定义一个方法，返回变量a的值
    public static int getA() {
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            //一定会执行的代码
            a = 100;
            return a;
        }
    }

}
