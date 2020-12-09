package com.xpzt.day07.demo05;

public class Zi extends Fu {

    int num = 20;

    public Zi() {
        this(1);
        System.out.println("无参构造方法");
    }

    public Zi(int num) {
        this(1, 2);
        System.out.println("一个参数构造方法");
    }

    public Zi(int num1, int num2) {
        //这里有一个隐含的super();
        System.out.println("两个参数构造方法");
    }

    public void method() {
        int num = 10;
        System.out.println(num);
        System.out.println(super.num);//11
        super.methodB();//父类
        methodB();//子类
        this.methodB();//子类 -- 就是为了容易看出是子类的成员方法
        System.out.println(this.num);
    }
    @Override
    public void methodB() {
        super.methodB();
        System.out.println("子类方法B执行！");
    }

}
