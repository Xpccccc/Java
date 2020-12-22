package com.xpzt.day15.demo02;

public class Demo02GenericClass {

    public static void main(String[] args) {

        //不写泛型默认为Object类型
        GenericClass<String> gc = new GenericClass<>();
        gc.setName("sb");
        System.out.println(gc.getName());

        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        System.out.println(gc2.getName());


    }
}
