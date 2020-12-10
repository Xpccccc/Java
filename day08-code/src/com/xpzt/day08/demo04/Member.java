package com.xpzt.day08.demo04;

import java.util.ArrayList;
import java.util.Random;

//群成员
public class Member extends User {
    public Member() {
    }

    //获得名字和钱
    public Member(String name, int money) {
        super(name, money);
    }

    //收红包方法 -- 给一个数组 ，随机取其中的某个元素

    public void receive(ArrayList<Integer> list) {

        int index = new Random().nextInt(list.size());//随机选一个红包
        //删除选中的那个，并把红包给自己
        int delta = list.remove(index);
        //当前成员本来有多少钱
        int money = super.getMoney();
        //现在总共多少钱
        super.setMoney(delta + money);

    }
}
