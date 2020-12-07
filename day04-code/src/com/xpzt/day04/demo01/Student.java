package com.xpzt.day04.demo01;

public class Student {
    private String name;
    private int age;

    //构造方法
    public Student() {
        System.out.println("无参构造方法执行了");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("全参构造方法执行了");
    }

    //Getter Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
