package com.xpzt.day15.demo02;


import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {

    public static void main(String[] args) {
        show02();
    }

    /*
     *  创建集合对象时，不使用泛型
     * 好处：
     *  1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
     *  2.把运行期异常（代码运行之后的异常），提升到了编译器（编译时报错）
     * 弊端：
     *  泛型是什么类型，只能存储什么类型的数据
     * */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
//      list.add(1);//java: 不兼容的类型: int无法转换为java.lang.String

        //使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s+"->"+s.length());
        }

    }

    /*
     * 创建集合对象时，不使用泛型
     * 好处：
     *       集合不使用泛型，默认的是Object类型，可以存储任何形式的数据
     * 弊端：
     *       不安全，会引发异常
     * */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        list.add(8.8);

        //使用迭代器遍历list集合
        //获取迭代器

        Iterator it = list.iterator();
        while (it.hasNext()) {
            //取出元素也是Object类型
            Object obj = it.next();
            System.out.println(obj);

            //想要String类特有的方法，length获取字符串长度；不能使用  多态Object obj="abc";
            //需要向下转型
            String s = (String) obj;
            //会抛出ClassCastException类型转换异常，不能把Integer类型转换为String类型
            System.out.println(s.length());
        }

    }
}
