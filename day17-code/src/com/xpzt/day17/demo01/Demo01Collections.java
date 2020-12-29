package com.xpzt.day17.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * java.util.Collections是集合工具类，用来对集合进行操作，部分方法如下：
 *   public static <T> boolean addAll(Collection<T> c,T... element):往集合中添加一些元素
 *   public static shuffle(List<?> list)打乱顺序：打乱集合顺序
 * */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("c");
        System.out.println(list);

        /*
        *  public static <T> boolean addAll(Collection<T> c,T... element):往集合中添加一些元素
        * */
        Collections.addAll(list,"3","4","2");
        System.out.println(list);

        /*
        *  public static shuffle(List<?> list)打乱顺序：打乱集合顺序
        * */
        Collections.shuffle(list);
        System.out.println(list);

    }

}
