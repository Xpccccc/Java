package com.xpzt.day11.demo03;

public class Demo01Main {

    public static void main(String[] args) {

        //对象的向上转型就是，父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();

        //向下转型 -- “还原”动作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //错误向下转型写法
        //本来new的是猫，现在非要当成狗
        //ClassCastException
//        Dog dog = (Dog) animal;
    }
}
