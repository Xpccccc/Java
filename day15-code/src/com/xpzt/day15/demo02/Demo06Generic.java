package com.xpzt.day15.demo02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 泛型的上限限定：？ extends E  代表使用的泛型只能是E的子类或者本身
 * 泛型的下限限定：？ super E    代表使用的泛型只能是E的父类或者本身
 * */
public class Demo06Generic {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();

        getElement1(list1);
//        getElement1(list2);//报错
        getElement1(list3);
//        getElement1(list4);//报错

//        getElement2(list1);//报错
//        getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);

    }

    /*
     * 类与类之间的继承关系
     * Integer extends Number extends Object
     * String extends Object
     * */

    //泛型的上限：此时的泛型必须是Number类型的子类或Number类型
    public static void getElement1(ArrayList<? extends Number> coll){}
    //泛型的下限：此时的泛型必须是Number类型的父类或Number类型
    public static void getElement2(Collection<? super Number> coll){}
}
