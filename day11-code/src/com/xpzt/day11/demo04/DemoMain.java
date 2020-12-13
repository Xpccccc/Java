package com.xpzt.day11.demo04;

public class DemoMain {

    public static void main(String[] args) {
        //创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标供电脑使用
        //首先进行向上转型
        USB usbMouse = new Mouse();//多态写法

        //创建一个USB键盘
        KeyBoard keyBoard = new KeyBoard();//没有使用多态写法
        //方法参数是USB类型，传进去的是实现类的对象

        computer.useDevice(keyBoard);//正确写法 ！ 这里也发生了向上转型

        //使用子类匿名对象，匿名对象，也可以
        computer.useDevice(new KeyBoard());//也是正确写法
        //使用鼠标
        computer.useDevice(usbMouse);

        computer.powerOff();

        System.out.println("=======================");

        method(10.0);
        method(20); //正确写法  -- int  --> double  -- 自动类型转换
        int a = 30;
        method(a);
    }

    public static void method(double num) {
        System.out.println(num);
    }
}
