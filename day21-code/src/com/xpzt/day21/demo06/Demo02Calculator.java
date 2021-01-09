package com.xpzt.day21.demo06;

/*
 * Lambda表达式有参数有返回值的练习
 * 需求：
 *   给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数值相加得到和值
 *   使用Lambda的标准格式调用invokeCalc方法，完成120加130的相加计算
 * */
public class Demo02Calculator {
    public static void main(String[] args) {
        //调用invokeCalc方法，方法参数一个接口，可以使用匿名内部类
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        //使用Lambda表达式，简化匿名内部类的书写
        invokeCalc(120, 130, (int a, int b) -> {
            return a + b;
        });

        //优化省略Lambda
        invokeCalc(120, 130, (a, b) -> a + b);
    }

    /*
     * 定义一个方法
     * 参数传递两个int类型的整数
     * 传输传递Calculator接口方法内部调用Calculator中的方法calc计算两个整数的和
     * */
    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
