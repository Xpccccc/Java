package com.xpzt.day11.demo02;

public class Demo01MultiField {

    public static void main(String[] args) {


        //成员变量：编译看左边，运行看左边
        //成员方法：编译看左边，运行看右边
        Fu obj = new Zi();
        System.out.println(obj.num);//父类 -- 看等号左边是谁，优先用谁，没有则向上找

        obj.showNum();
    }
}
