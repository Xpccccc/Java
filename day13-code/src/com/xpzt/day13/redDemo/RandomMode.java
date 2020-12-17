package com.xpzt.day13.redDemo;

import com.xpzt.day13.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

//随机分发类
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        //最少分1分钱，最多分得"剩余钱数的平均数的两倍"
        //r.nextInt(LeftMoney/LeftCount*2)+1

        //先创建一个随机数生成器
        Random r = new Random();

        //余额
        int leftMoney = totalMoney;
        //剩余要分的人数
        int leftCount = totalCount;

        //开始分配，最后一个人不用分配

        for (int i = 0; i < totalCount - 1; i++) {
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            list.add(money);
            leftMoney -= money;
            leftCount--;
        }

        //分配最后一个
        list.add(leftMoney);
        return list;
    }
}
