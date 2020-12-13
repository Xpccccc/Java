package com.xpzt.day11.demo03;

public class Demo02Instanceof {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.eat();


        //向下转型一定要进行instanceof判断，否则可能发生类转换异常
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        giveAPet(new Dog());
    }

    public static void giveAPet(Animal animal) {
        //判断父类引用animal本来是不是Cat
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        //判断父类引用animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
    }
}
