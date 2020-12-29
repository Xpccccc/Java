package com.xpzt.day17.demo03;

import java.util.HashMap;
import java.util.Hashtable;

/*
 * java.util.Hashtable<K,V>集合 implements Map<K,V>集合
 *
 * Hashtable:底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
 * HashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程集合，速度快
 *
 * HashMap集合(之前所学的所有集合)：可以存储null值，null键
 * Hashtable集合，不可以存储null值，null键
 *
 *Hashtable集合和Vector集合一样，在jdk1.2之后被更先进的集合（HashMap，ArrayList）取代了
 * Hashtable的子类Properties仍然活跃在历史舞台
 * Properties集合是唯一一个和IO流相结合的集合
 * */
public class Demo03Hashtable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("a", null);
        map.put(null, null);
        System.out.println(map);

        Hashtable<String, String> table = new Hashtable<>();
//        table.put(null, "a");//NullPointerException
//        table.put("a", null);//NullPointerException
//        table.put(null, null);//NullPointerException
        System.out.println(table);

    }

}
