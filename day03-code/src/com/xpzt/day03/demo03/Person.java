package com.xpzt.day03.demo03;

public class Person {
    String name;
    private int age;
    private boolean male;

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    public void setAge(int num) {
        if (num > 0 && num < 100) {
            age = num;
        } else {
            System.out.println("数据错误");
        }
    }

    //成对使用
    public int getAge() {
        return age;
    }
}
