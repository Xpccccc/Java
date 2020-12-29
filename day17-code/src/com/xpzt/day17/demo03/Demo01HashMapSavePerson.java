package com.xpzt.day17.demo03;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap存储自定义类型键值
 * Map集合保证key是唯一的
 *   作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
 * */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    /*
     *  HashMap存储自定义类型键值
     * key：People类型
     *      People类就必须重写了hashCode方法和equals方法，以保证key唯一
     * value：String类型
     *      可以重复
     * */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("特朗普", 11), "美国");
        map.put(new Person("习近平", 12), "中国");
        map.put(new Person("普京", 11), "俄罗斯");
        map.put(new Person("特朗普", 11), "中国");
        //使用keySet加增强for循环遍历Map集合
        Set<Person> set = map.keySet();
        for (Person key : set) {
            String value = map.get(key);
            System.out.println(key+"-->"+value);
        }
    }

    /*
     *  HashMap存储自定义类型键值
     * key：String类型
     *      String类重写了hashCode方法和equals方法，可以保证key唯一
     * value：Person类型
     *       value可以重复（同名同年龄的人视为同一个人）
     * */
    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("广州", new Person("王五", 20));
        map.put("北京", new Person("赵六", 18));

        //使用keySet加增强for循环遍历Map集合
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + "-->" + value);
        }
    }
}
