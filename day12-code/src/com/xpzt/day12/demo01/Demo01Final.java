package com.xpzt.day12.demo01;

public class Demo01Final {

    public static void main(String[] args) {

        int num1 = 10;
        System.out.println(num1);
        final int num2 = 20;
        System.out.println(num2);
        //错误写法，"一次赋值，终生不变"
        //num2 = 10;

        //正确写法，只要保证有唯一一次赋值就行
        final int num3;
        num3 = 11;

        //对于基本类型来说，不可改变的是变量的数据不可改变
        //对于引用类型来说，不可改变的是变量的地址不可改变
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        stu1 = new Student("霍建华");
        System.out.println(stu1.getName());
        System.out.println(stu1);

        System.out.println("===============");

        final Student stu2 = new Student("李浩");
        System.out.println(stu2.getName());
        //不能改变的是地址，但是内容可以改变
        //stu2 = new Student("张思");
        stu2.setName("李浩浩浩");
        System.out.println(stu2.getName());
    }
}
