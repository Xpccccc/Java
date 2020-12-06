package com.xpzt.day03.demo03;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "陈浩";
        person.setAge(20);
        person.setMale(false);
        System.out.println("我叫" + person.name + "， 年龄" + person.getAge() + "， 是男的？" + person.isMale());
    }

}
