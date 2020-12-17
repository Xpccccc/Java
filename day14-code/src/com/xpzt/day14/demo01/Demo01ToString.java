package com.xpzt.day14.demo01;

public class Demo01ToString {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("李白");
        person.setAge(20);

        //看一个类是否重写了toString，直接打印这个类的对象即可，如果没有重写toString方法，那么打印的是对象的地址值
        String p = person.toString();
        System.out.println(person);
        System.out.println(p);

    }
}
