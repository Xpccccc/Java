package com.xpzt.day11.demo02;

public class Demo02MultiMethod {

    public static void main(String[] args) {

        //成员变量：编译看左边，运行看左边
        //成员方法：编译看左边，运行看右边
        Fu obj=new Zi();//多态
        obj.method();//父子否有，优先用子类
        obj.methodFu();//子类没有，父类有，向上找到父类
    }
}
