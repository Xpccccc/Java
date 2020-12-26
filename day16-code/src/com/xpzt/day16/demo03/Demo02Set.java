package com.xpzt.day16.demo03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * java.util.Set接口 extends Collection接口
 * Set接口的特点：
 *   1.不允许存储重复元素
 *   2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
 *
 * java.util.HashSet接口 implements Set接口
 * HashSet接口特点：
 *   1.不允许存储重复元素
 *   2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
 *   3.是一个无序的集合，存储元素和取出元素顺序可能不一致
 *   4.底层是一个哈希表(查询速的非常快)
 * */
public class Demo02Set {

    public static void main(String[] args) {

        Set<Integer> hasSet = new HashSet<>();
        //使用add方法往集合中添加元素
        hasSet.add(1);
        hasSet.add(2);
        hasSet.add(3);
        hasSet.add(1);

        //使用迭代器遍历hasSet集合
        Iterator<Integer> it = hasSet.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
        System.out.println("=====================");
        //使用增强for循环遍历hasSet集合
        for (Integer i : hasSet) {
            System.out.println(i);
        }
    }
}
