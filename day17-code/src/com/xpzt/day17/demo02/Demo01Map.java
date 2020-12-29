package com.xpzt.day17.demo02;

import java.util.HashMap;
import java.util.Map;

/*
 * java.util.Map<k,v>集合
 * Map集合的特点
 *   1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
 *   2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
 *   3.Map集合中的元素，key是不允许重复的，value可以重复
 *   4.Map集合中的元素，key和value是一一对应的
 * java.util.HashMap<k,v>集合 implements Map<k,v>接口
 * HashMap集合的特点：
 *   1.HashMap集合的底层是哈希表：查询速度非常快
 *       JDK1.8之前：数组+单向链表
 *       JDK1.8之后：数组+单向链表/红黑树(链表长度超过8)：提高查询速度
 *   2.HashMap集合是一个无序集合，存储元素和取出元素的顺序有可能不一致
 * java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
 * LinkedHashMap集合的特点：
 *   1.LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序）
 *   2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
 * */
public class Demo01Map {

    public static void main(String[] args) {
        show04();
    }

    /*
     * boolean containsKey(Object key):判断集合中是否包含指定的键
     * 包含返回true，不包含返回false
     * */
    private static void show04() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("陈浩", 11);
        map.put("陈bb", 1);
        map.put("cc", 11);
        System.out.println(map.containsKey("cc"));//true
        System.out.println(map.containsKey("c"));//false
    }

    /*
     * public V get(Object key):根据指定的键 在Map集合中获取对应的值
     * 返回值v:
     *       key存在，v返回对应的value的值
     *       key不存在，v返回null
     * */
    private static void show03() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("陈浩", 11);
        map.put("陈bb", 1);
        map.put("cc", 11);
        Integer v1 = map.get("陈浩");
        System.out.println("v1:" + v1);
        Integer v2 = map.get("陈浩sb");
        System.out.println("v2:" + v2);
    }

    /*
     * public V remove(Object key):把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值
     * 返回值v:
     *       key存在，v返回被删除的值
     *       key不存在，v返回null
     * */
    private static void show02() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("陈浩", 11);
        map.put("陈bb", 1);
        map.put("cc", 11);
        System.out.println(map);
        Integer v1 = map.remove("陈bb");
        System.out.println(v1);
        System.out.println(map);
        System.out.println("===========");

        //int v2 = map.remove("陈cb");//自动拆箱  -  NullPointerException
        //所以尽量使用包装类
        Integer v2 = map.remove("陈cb");
        System.out.println(v2);
        System.out.println(map);

    }

    /*
     * public V put(K key,V value):把指定的键与指定的值添加到Map集合中
     *   返回值：v
     *       存储键值对的时候：key不重复，返回值v是null
     *       存储键值对的时候：key重复，会使用新的value替换map中重复的value，返回被替换的value
     * */
    private static void show01() {
        //创建Map集合对象，多态
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("陈浩", "abc");
        System.out.println("v1：" + v1);
        String v2 = map.put("陈浩", "abcd");
        System.out.println("v2：" + v2);
        System.out.println(map);

        map.put("陈浩sb", "abcd");
        System.out.println(map);


    }
}
