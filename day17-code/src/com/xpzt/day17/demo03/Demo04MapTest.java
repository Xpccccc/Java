package com.xpzt.day17.demo03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 练习：
 *   计算一个字符串中每个字符出现的次数
 *
 * 分析：
 *   1.使用Scanner获取用户输入的字符串
 *   2.创建Map集合，key是字符串中的字符，value是字符的个数
 *   3.遍历字符串，获取每一个字符
 *   4.使用获取到的字符，去Map集合判断key是否存在
 *       key存在：
 *           通过字符(key),获取value(字符个数)
 *           value++
 *           put(key,value)把新的value存储到Map集合中
 *       key不存在：
 *           put(key,1)
 * 5.遍历Map集合，输出结果
 * */
public class Demo04MapTest {
    public static void main(String[] args) {
        //1.使用Scanner获取用户输入的字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        //2.创建Map集合，key是字符串中的字符，value是字符的个数
        HashMap<Character,Integer> map=new HashMap<>();
        Set<Character> set = map.keySet();
        //3.遍历字符串，获取每一个字符
        for(char key:str.toCharArray()){

            //4.使用获取到的字符，去Map集合判断key是否存在


            if(map.containsKey(key)){/*key存在*/
                //通过字符(key),获取value(字符个数)
                Integer value = map.get(key);
                value++;
                // put(key,value)把新的value存储到Map集合中
                map.put(key,value);
            }else{/*key不存在*/
                map.put(key,1);
            }
        }

        // 5.遍历Map集合，输出结果
        for (Character key : set) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }

}
