package com.xpzt.day16.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * 斗地主综合案例
 *   1.准备牌
 *   2.洗牌
 *   3.发牌
 *   4.看牌
 * */
public class Test {
    public static void main(String[] args) {

        //准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存储牌的花色，一个存储牌的序号
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先把大小王存储到poker集合
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }
//        System.out.println(poker);

        //洗牌
        /*
         * 使用Collections工具类中的方法
         * static void shuffle(list<?> list ) 使用随机默认源对指定列表进行打印
         * */

        Collections.shuffle(poker);
//        System.out.println(poker);

        //发牌
        //先创建四个集合
        //3个玩家集合
        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        //一个底牌集合
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            //i>=51时发牌给底牌
            //从索引%3给三个玩家轮流发牌
            //注意，先判断i>=52,否则牌就发没了
            String p = poker.get(i);//获取牌
            if (i >= 51) {
                //底牌
                dipai.add(p);
            } else if (i % 3 == 0) {
                //给玩家1发牌
                play01.add(p);
            } else if (i % 3 == 1) {
                //给玩家2发牌
                play02.add(p);
            } else if (i % 3 == 2) {
                //给玩家3发牌
                play03.add(p);
            }
        }

        //看牌
        System.out.println("周星驰"+play01);
        System.out.println("刘德华"+play02);
        System.out.println("周润发"+play03);
        System.out.println("底牌"+dipai);
    }

}
