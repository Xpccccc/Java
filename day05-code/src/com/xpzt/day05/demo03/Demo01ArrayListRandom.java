package com.xpzt.day05.demo03;

import java.util.ArrayList;
import java.util.Random;

/*
 * 生成6个1`33 d的随机数，添加到集合，遍历集合
 * */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        //生成6个随机数，并放到集合中
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
