package com.xpzt.day04.demo01;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        Student stu2=new Student("陈浩",20);

        System.out.println("我叫"+stu2.getName()+"， 年龄"+stu2.getAge());

        stu1.setName("狗江");
        stu1.setAge(11);
        System.out.println("我叫"+stu1.getName()+"， 年龄"+stu1.getAge());

    }
}
