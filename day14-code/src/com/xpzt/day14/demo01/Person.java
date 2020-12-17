package com.xpzt.day14.demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //覆盖重写toString方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Object类的equals方法，默认比较大是两个对象的地址值，没有意义
    //覆盖重写equals方法，比较两个对象的属性

    @Override
    public boolean equals(Object obj) {
        //增加一个判断，如果是this本身，直接返回true，提高程序效率
        if (obj == this) {
            return true;
        }

        //增加一个判断，如果传递参数是null，返回false,提高程序效率
        if (obj == null) {
            return false;
        }

        //增加一个判断防止类转换异常
        if (obj instanceof Person) {
            // 使用向下转型，将obj强转成Person类
            Person p = (Person) obj;
            //比较两个对象的属性
            boolean b = this.name == p.name && this.age == p.age;
            return b;
        }
        return false;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this ==
    ////getClass() != o.getClass()使用反射技术，判断o是不是Person类型  -- 等效于 obj instanceof Person
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
    ////使用Object类的equals方法，对两个对象进行比较，可以防止空指针异常
//        return age == person.age && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
