package com.xpzt.day05.demo03;

import java.util.ArrayList;
import java.util.Random;

/*
 * 用一个大集合存入20个随机数字，然后筛选里面的偶数元素，然后放到小集合中
 * 要求使用自定义的方法实现筛选
 * */
public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();//大集合
        Random r = new Random();
        //生成20个随机数存到集合

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(50);
            bigList.add(num);
            System.out.print(bigList.get(i) + " ");
        }
        System.out.println();
        ArrayList<Integer> listSmall = returnArrList(bigList);//接收小集合
        System.out.println("小集合元素个数：" + listSmall.size());
        //便利打印小集合
        for (int i = 0; i < listSmall.size(); i++) {
            System.out.print(listSmall.get(i) + " ");
        }

    }

    //筛选
    public static ArrayList<Integer> returnArrList(ArrayList<Integer> list) {
        ArrayList<Integer> listSmall = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0) {
                listSmall.add(num);
            }
        }
        return listSmall;//返回小集合
    }
}
