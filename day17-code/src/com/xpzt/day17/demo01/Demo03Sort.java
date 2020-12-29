package com.xpzt.day17.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * java.util.Collections是集合工具类，用来对集合进行操作，部分方法如下：
 *       public static <T> void sort (List<T> list,Comparator<? super T>):将集合中元素按照指定规则排序
 *
 * Comparator和Comparable的区别
 *      Comparable：自己(this)和别人(参数)比较，自己需要实现Comparable接口，重写比较的CompareTo方法
 *      Comparator：相当于第三方的裁判，比较两个
 *
 * Comparator比较规则：
 *      o1-o2：升序
 * */
public class Demo03Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);
        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return 0;
                return o1 - o2;
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("a陈浩", 14));
        list02.add(new Student("陈bb", 25));
        list02.add(new Student("陈dd", 1));
        list02.add(new Student("b陈dd", 14));
//        Collections.sort(list02, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return 0;
//                //按照年龄升序
//                return o1.getAge() - o2.getAge();
//            }
//        });

        //拓展
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return 0;
                //按照年龄升序
                int result = o1.getAge() - o2.getAge();
                //如果两个人的年龄相同，再使用姓名的第一个字进行比较
                if (result == 0) {
                    return o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list02);
    }

}
