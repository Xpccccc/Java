package com.xpzt.day16.demo03;

import java.util.LinkedList;

/*
 * java.util.LinkedList集合 implement List集合
 * linkedList集合的特点：
 *   1.底层是一个链表结构，查询慢，增删快
 *   2.里面包含了大量首尾元素的方法
 *   注意：使用linkedList集合特有的方法，不能使用多态
 *
 *       public void addFirst(E e):将指定元素插入此列表的开头
 *       public void addLast(E e):将指定元素添加到此列表的末尾
 *       public void push(E e):将元素推入此列表表示的堆栈
 *
 *       public E getFirst():返回此列表的第一个元素
 *       public E getLast():返回此列表的最后一个元素
 *
 *       public E removeFirst():移除并返回此列表第一个元素
 *       public E removeLast():移除并返回此列表最后一个元素
 *       public E pop():从此列表所表示的堆栈弹出第一个元素
 *
 *       public boolean iseEmpty():如果列表不包含元素，则返回true
 *
 * */
public class Demo01LinkedList {

    public static void main(String[] args) {
        show03();
    }

    /*
     *       public E removeFirst():移除并返回此列表第一个元素
     *       public E removeLast():移除并返回此列表最后一个元素
     *       public E pop():从此列表所表示的堆栈弹出第一个元素  相当于removeFirst()
     * */
    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        //public E removeFirst():移除并返回此列表第一个元素
        //String first = linked.removeFirst();
        String first = linked.pop();
        System.out.println("被移除的第一个元素是：" + first);
        System.out.println(linked);

        //public E removeLast():移除并返回此列表最后一个元素
        String last = linked.removeLast();
        System.out.println("被移除的最后一个元素是：" + last);
        System.out.println(linked);

    }

    /*
     *       public E getFirst():返回此列表的第一个元素
     *       public E getLast():返回此列表的最后一个元素
     * */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

//        linked.clear();
        if (!linked.isEmpty()) {
            //public E getFirst():返回此列表的第一个元素
            String first = linked.getFirst();
            System.out.println(first);
            System.out.println(linked);

            //public E getLast():返回此列表的最后一个元素
            String last = linked.getLast();
            System.out.println(last);
            System.out.println(linked);
        }

    }

    /*
     *       public void addFirst(E e):将指定元素插入此列表的开头
     *       public void addLast(E e):将指定元素添加到此列表的末尾
     *       public void push(E e):将元素推入此列表表示的堆栈
     * */
    public static void show01() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        System.out.println(linked);
        //public void addFirst(E e):将指定元素插入此列表的开头
        //linked.addFirst("www");
        linked.push("www");
        System.out.println(linked);

        //public void addLast(E e):将指定元素添加到此列表的末尾 等效于add(E e)
        linked.addLast("com");
        System.out.println(linked);


    }
}
