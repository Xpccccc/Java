package com.xpzt.day12.demo03;

public class Demo02InnerClass {

    public static void main(String[] args) {
        //外部类.内部类 对象名=new 外部类名称().new 内部类名称();
        Outer.Inner inner = new Outer().new Inner();
        inner.method();
    }
}
