package com.xpzt.day03.demo04;

public class Person {
    String name;
    int age;

    public void sayHello(String name) {
        System.out.println(name + ",你好。我是" + this.name);
        System.out.println(this);
    }

}
