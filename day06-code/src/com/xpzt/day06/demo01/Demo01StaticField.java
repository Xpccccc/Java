package com.xpzt.day06.demo01;

public class Demo01StaticField {

    public static void main(String[] args) {
        Student one = new Student("郭靖", 22);
        Student.room = "101班";
        System.out.println("姓名：" + one.getName() + "， 年龄：" + one.getName() +
                "， 班级：" + one.room + "，学号：" + one.getId());
        Student two = new Student("黄蓉", 21);
        System.out.println("姓名：" + one.getName() + "， 年龄：" + one.getName() +
                "， 班级：" + two.room + "，学号：" + two.getId());
    }
}
