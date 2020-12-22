package com.xpzt.day15.demo02;

/*
 * 测试含有泛型的方法
 * */
public class Demo03GenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gc = new GenericMethod();

        /*
         * 调用含有泛型的方法method01
         * 传递什么类型，泛型就是什么类型
         * */
        gc.method01(11);
        gc.method01("sb");
        gc.method01(1.1);
        gc.method01(true);

        System.out.println("===============");

        GenericMethod.method02("静态方法");
        GenericMethod.method02(1.1);
    }
}
