package com.xpzt.day11.demo02;

public class Zi extends Fu {
    int num = 20;

    @Override
    public void showNum() {
        System.out.println(this.num);
    }

    @Override
    public void method(){
        System.out.println("父类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
