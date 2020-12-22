package com.xpzt.day15.demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
* java.util.Collection接口
*   所有单列集合最顶层的接口，里边定义了所有单列集合共性的方法
*   任意的单列集合都可以使用Collection接口中的方法
*
* 共性的方法：
     boolean add(E e)确保此 collection 包含指定的元素（可选操作）。
     boolean remove(Object o)从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
     void clear()移除此 collection 中的所有元素（可选操作）。
     boolean contains(Object o)如果此 collection 包含指定的元素，则返回 true。
     boolean isEmpty()如果此 collection 不包含元素，则返回 true。
     int size()返回此 collection 中的元素数。
     Object[] toArray()返回包含此 collection 中所有元素的数组。

* */
class Demo01Collection {

    public static void main(String[] args) {
        //创建集合对象，使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了toString方法

        /* boolean add(E e)确保此 collection 包含指定的元素（可选操作）。
         * 返回值是一个boolean值，一般我都返回true，所以不用接收*/

        coll.add("陈浩");
        coll.add("猪比");
        coll.add("狗江");
        coll.add("骚彪");
        System.out.println(coll);

        /* boolean remove(Object o)从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
         返回值是一个boolean值，集合中存在元素，删除元素，返回true
                             集合中不存在元素，删除失败，返回false
         * */

        boolean b1 = coll.remove("陈浩");
        System.out.println(b1);
        boolean b2 = coll.remove("shab");
        System.out.println(b2);

        /*boolean contains(Object o)如果此 collection 包含指定的元素，则返回 true。
         * 包含返回true
         * 不包含返回false*/

        boolean b3 = coll.contains("陈浩");
        System.out.println(b3);
        boolean b4 = coll.contains("陈");
        System.out.println(b4);


        /*boolean isEmpty()如果此 collection 不包含元素，则返回 true。
         * 集合为空返回true，集合不为空返回false*/

        boolean b5 = coll.isEmpty();
        System.out.println(b5);


        /*int size()返回此 collection 中的元素数。
         * 返回集合中元素个数*/

        int size = coll.size();
        System.out.println(size);


        /*Object[] toArray()返回包含此 collection 中所有元素的数组。
         * 把集合中的元素存储到数组中*/

        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }


        /*void clear()移除此 collection 中的所有元素（可选操作）。
        * 但是不删除集合，集合还存在*/

        coll.clear();
        System.out.println(coll);
        boolean b6 = coll.isEmpty();
        System.out.println(b6);

    }
}
