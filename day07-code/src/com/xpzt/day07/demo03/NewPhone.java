package com.xpzt.day07.demo03;

//新款手机
public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show();//继续用父类的
        System.out.println("姓名");
        System.out.println("归属地");
    }
}
