package com.xpzt.day13.redDemo;

import com.xpzt.day13.red.OpenMode;

import java.util.ArrayList;

//平均红包分发类
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        //先平均分，如果有余数给最后一个
        int avg = totalMoney / totalCount;//平均金额
        int mod = totalMoney % totalCount;//余数

        //开始分配,最后一个先不分配
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        //最后一个得平均数加余数
        list.add(avg + mod);
        return list;
    }
}
