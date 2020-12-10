package com.xpzt.day08.demo03;

public class DemoMain {

    public static void main(String[] args) {

//        Fu fu=new Fu();//错误
//        Zi zi=new Zi();//抽象类不能new对象
        Sun sun = new Sun();
        sun.sleep();
        sun.eat();
        System.out.println("============");

        SunTwo sunTwo = new SunTwo();
        sunTwo.sleep();
        sunTwo.eat();

    }
}
