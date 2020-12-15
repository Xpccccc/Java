package com.xpzt.day12.demo01;

public class Person {

    //final修饰成员变量
    private final String name/* = "猪比"*/;

    public Person() {
        name = "陈浩";
    }

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
