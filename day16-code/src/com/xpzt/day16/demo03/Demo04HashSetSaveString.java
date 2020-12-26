package com.xpzt.day16.demo03;

import java.util.HashSet;
import java.util.Set;

/*
 * Set集合不允许存储重复元素的原理
 * Set集合在调用add方法时，add方法会调用元素的hashCode方法和equals方法，判断元素是否重复
 * */
public class Demo04HashSetSaveString {

    public static void main(String[] args) {
        //创建hashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        /*
         *add方法会调用s1的hashCode方法，计算字符串"abc"的哈希值，是96354，
         * 在集合中找到没有96354这个哈希值的元素，发现没有
         * 就会把s1存储集合中
         * */
        set.add(s2);
        /*
         * add方法会调用s1的hashCode方法，计算字符串"abc"的哈希值，是96354，
         * 在集合中找到有96354这个哈希值的元素，发现有(哈希冲突)
         * s2会调用equals方法和哈希值相同的元素进行比较 s2.equals(s1),返回true
         * 两个元素的哈希值相同，equals方法返回true，认定两个元素相同
         * 就不会把s2存储到集合中
         * */
        set.add("重地");
        /*
         *add方法会调用s1的hashCode方法，计算字符串"重地"的哈希值，是1179395，
         * 在集合中找到没有1179395这个哈希值的元素，发现没有
         * 就会把"重地"存储集合中
         * */
        set.add("通话");
        /*
        add方法会调用s1的hashCode方法，计算字符串"通话"的哈希值，是1179395，
         * 在集合中找到有1179395这个哈希值的元素，发现有(哈希冲突)
         * "通话"会调用equals方法和哈希值相同的元素进行比较 "通话".equals("重地"),返回false
         * 两个元素的哈希值相同，equals方法返回false，认定两个元素不相
         * 就会把"通话"存储到集合中
         * */
        set.add("abc");
        System.out.println(set);


    }
}
