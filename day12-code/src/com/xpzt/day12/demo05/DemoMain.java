package com.xpzt.day12.demo05;

public class DemoMain {

    public static void main(String[] args) {

        //使用匿名内部类
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类覆盖重写了接口抽象方法 111-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类覆盖重写了接口抽象方法 222-A");
            }
        };
        objA.method1();
        objA.method2();

        System.out.println("=================================");

        //匿名内部类.方法(既是匿名内部类，又是匿名对象)
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类覆盖重写了接口抽象方法 111-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类覆盖重写了接口抽象方法 222-A");
            }
        }.method1();

        //使用了匿名内部类，省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类覆盖重写了接口抽象方法 111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类覆盖重写了接口抽象方法 222-B");
            }
        }.method2();
    }
}
