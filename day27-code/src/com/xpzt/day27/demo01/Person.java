package com.xpzt.day27.demo01;

import java.io.Serializable;

/*
 * 序列化和反序列化的时候,会抛出 NotSerializableException 没有序列化异常
 * 类通过实现 java.io.Serializable 接口以启用其序列化功能.未实现此接口的类将无法使其任何状态序列化或反序列化
 * Serializable接口也叫标记型接口
 *   要进行序列化和反序列化的类必须实现Serializable接口,就会给类添加一个标记
 *   当我们进行序列化和反序列化的时候,就会检测类上是否有这个标记
 *       有:就可以序列化和反序列化
 *       没有:就会抛出 NotSerializableException 异常
 *
 * 去市场买肉-->肉上有一个蓝色章(检测合格)-->放心购买-->买回来怎么吃随意
 *
 * static关键字:静态关键字
 *       静态优先于非静态加载到内存中(静态优先于对象进入到内存中)
 *       被static修饰的成员变量是不能被序列化的,序列化的都是对象
 *       private static int age;
 *       oos.writeObject(new Person("陈浩", 11));
 *       Person{name='陈浩', age=0}
 *       陈浩=0
 *
 * transient关键字:瞬态关键字
 *       被transient关键字修饰的成员变量,不能被序列化的
 *       private transient int age;
 *       oos.writeObject(new Person("陈浩", 11));
 *       Person{name='陈浩', age=0}
 *       陈浩=0
 *
 * 问题:
 *      每次修改类的定义,都会给class文件生成一个新的序列号
 * 解决方案:
 *      无论是否对类的定义进行修改,都不重新生成新的序列号
 *      可以手动给类添加一个序列号
 * 格式在Serializable接口规定:
 *      可序列化类可以通过声明名为"serialVersionUID"的字段(该字段必须是是静态的(static),最终的(final),和long型的字段)
 *      显式声明其自己的serialVersionUID:
 *      static final long serialVersionUID = 42L; 常量 不可改变
 * */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;//序列号 常量-不能改变
    private String name;
    //private static int age;
    //private transient int age;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }
}
