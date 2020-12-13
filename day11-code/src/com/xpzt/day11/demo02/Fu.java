package com.xpzt.day11.demo02;

public class Fu {
    int num = 10;

    public void showNum() {
        System.out.println(this.num);
    }

    public void method(){
        System.out.println("父类方法");
    }

    public void methodFu(){
        System.out.println("父类特有方法");
    }
}
