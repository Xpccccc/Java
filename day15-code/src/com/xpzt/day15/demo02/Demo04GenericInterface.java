package com.xpzt.day15.demo02;

public class Demo04GenericInterface {

    public static void main(String[] args) {
        //创建GenericImplement1对象
        GenericInterface<String> gi = new GenericInterfaceImpl1();//多态
        gi.method("abc");

        //创建GenericImplement2对象
        GenericInterfaceImpl2<String> gi2 = new GenericInterfaceImpl2<>();
        gi2.method("def");

        System.out.println("====================");
        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(2.2);
        System.out.println("====================");
        GenericInterfaceImpl2<Integer> gi4 = new GenericInterfaceImpl2<>();
        gi4.method(5);
    }
}
