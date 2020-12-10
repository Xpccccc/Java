package com.xpzt.day08.demo04;

import java.util.ArrayList;

//群主
public class Manager extends User {

    public Manager() {
    }

    //获得名字和余额
    public Manager(String name, int money) {
        super(name, money);
    }

    //发红包方法  -- 总共发多少钱，分多少份
    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> listRed = new ArrayList<>();
        //如果想法的红包比余额多
        if (totalMoney > super.getMoney()) {
            System.out.println("余额不足");
            return listRed;
        }
        //发完红包之后的余额
        super.setMoney(getMoney() - totalMoney);
        //平均每个人分到的钱
        int avg = totalMoney / count;
        //多出来的钱放在最后一个位置上
        int mod = totalMoney % count;
        //先包好count-1个
        for (int i = 0; i < count - 1; i++) {
            listRed.add(avg);
        }
        //最后一个
        listRed.add(avg + mod);
        return listRed;
    }

}
