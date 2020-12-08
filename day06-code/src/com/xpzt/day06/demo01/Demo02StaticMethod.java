package com.xpzt.day06.demo01;

public class Demo02StaticMethod {

    public static void main(String[] args) {

        MyClass obj=new MyClass();
        obj.method();
        obj.methodStatic();//不推荐
        MyClass.methodStatic();//推荐
    }
}
