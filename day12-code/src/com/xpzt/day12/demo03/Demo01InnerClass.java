package com.xpzt.day12.demo03;

public class Demo01InnerClass {

    public static void main(String[] args) {
        Body body = new Body("陈浩");//外部类对象
        //通过外部类对象，调用内部类方法，里面简介在使用内部类Heart
        body.method();
        System.out.println("=============");

        //使用公式写：
        //外部类名称.内部类名称 对象名 = new 外部类名称().内部类名称();
        Body.Heart heart = new Body("猪比").new Heart();
        heart.heat();
    }
}
