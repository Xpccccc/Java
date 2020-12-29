package com.xpzt.day17.demo05;

import java.util.*;

/*
 * 斗地主综合案例：有序版本
 * 1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.排序
 * 5.看牌
 * */
public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌
        //创建一个Map集合，存储牌的索引和组装好的牌
        Map<Integer,String> poker=new HashMap<>();
        //创建一个List集合用来存储牌的索引
        List<Integer> pokerIndex=new ArrayList<>();
        //定义两个集合，分别存储牌的花色和序号
        List<String> colors=List.of("♣","♥","♠","♦");
        List<String> nums=List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        //索引序号
        int index=0;
        //先把大王小王存储到poker集合中
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //组装牌
        for (String num : nums) {
            for (String color : colors) {
                poker.put(index,color+num);
                pokerIndex.add(index);
                index++;
            }
        }

        //洗牌
        Collections.shuffle(pokerIndex);
        //发牌
        //创建四个集合，分别存储玩家和底牌的牌的索引
        List<Integer> play01=new ArrayList<>();
        List<Integer> play02=new ArrayList<>();
        List<Integer> play03=new ArrayList<>();
        List<Integer> diPai=new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);//将乱牌的索引分发
            if(i>=51){
                //发底牌
                diPai.add(in);
            }else if(i%3==0){
                //玩家1
                play01.add(in);
            }else if(i%3==1){
                //玩家2
                play02.add(i);
            }else if(i%3==2){
                //玩家3
                play03.add(in);
            }
        }

        //排序
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);
        Collections.sort(diPai);

        /*
        * 定义一个看牌的方法，提高代码的复用率
        * 参数：
        *   String name:玩家名称
        *   Map<Integer,String> map:存储牌的集合
        *   List<Integer> list：存储玩家和底牌的集合
        * 查表法：
        *   遍历玩家或底牌，获取排队索引
        *   根据索引，去Map集合找到对应的牌
        * */

        //看牌
        lookPoker("陈浩：",poker,play01);
        lookPoker("猪比：",poker,play02);
        lookPoker("狗比：",poker,play03);
        lookPoker("底牌：",poker,diPai);

//        System.out.println(poker);

    }
    public static void lookPoker(String name,Map<Integer,String> map,List<Integer> list){
        System.out.print(name+"");

        //遍历玩家牌或底牌集合
        /*for (int i = 0; i < list.size(); i++) {
            String value = map.get(i);//根据索引获取牌
            System.out.print(value+" ");
        }*/

        for (Integer key : list) {
            String value = map.get(key);//根据索引获取牌
            System.out.print(value+" ");
        }
        //打印一组牌后换行
        System.out.println();
    }
}
