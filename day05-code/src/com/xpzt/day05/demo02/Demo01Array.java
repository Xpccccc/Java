package com.xpzt.day05.demo02;

import java.time.Period;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];//对象数组
        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 22);
        Person three = new Person("哈妮克孜", 20);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0].getName());

    }
}
