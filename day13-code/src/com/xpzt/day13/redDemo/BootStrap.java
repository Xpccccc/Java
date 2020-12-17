package com.xpzt.day13.redDemo;

import com.xpzt.day13.red.OpenMode;

public class BootStrap {

    public static void main(String[] args) {
//        RedPacketFrame frame=new RedPacketFrame() ;//抽象类
        //程序名
        MyRed myRed = new MyRed("陈浩");
        //群主名字
        myRed.setOwnerName("猪比");
        //分发方式
//        OpenMode open = new NormalMode();
//        myRed.setOpenWay(open);
        OpenMode open1=new RandomMode();
        myRed.setOpenWay(open1);
    }
}
