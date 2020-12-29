package com.xpzt.day17.demo04;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * JDK9新特性：
 *   List接口，Set接口，Map接口：里边增加了一些静态方法of，可以给集合一次性添加多个元素
 *   static <E> List<E> of(E...elements)
 * 使用前提：
 *       当集合中存储的元素的个数已经确定了，不再改变时使用
 * 注意：
 *   1.of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
 *   2.of方法的返回值是一个不能改变的集合，集合不能再使用add方法，put方法添加元素，会抛出异常
 *   3.Set接口和Map接口在调用of方法时，不能有重复元素，否则会抛出异常
 * */
public class Demo01JDk9 {
    public static void main(String[] args) {
        List<String> list=List.of("a","b","c","a");
        System.out.println(list);
//        list.add("w");//UnsupportedOperationException

//        Set<String> set=Set.of("a","b","c","a");//IllegalArgumentException
        Set<String> set=Set.of("a","b","c");
        System.out.println(set);

//        Map<String,Integer> map=Map.of("a",1,"b",2,"c",3,"a",1);//IllegalArgumentException
        Map<String,Integer> map=Map.of("a",1,"b",2,"c",3);
//        map.put("a",1);////UnsupportedOperationException
        System.out.println(map);
    }

}
