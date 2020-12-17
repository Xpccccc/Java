package com.xpzt.day14.demo07;


/*
装箱：把基本类型的数据，包装到包装类中（基本数据类型->包装类）
    构造方法：
        Integer(int value)构造一个新分配的Integer对象，它表示指定的int值
        Integer(String s)构造一个新分配的String对象，它表示String参数所指示的int值
            传递的字符串，必须是基本类型的字符串，否则会抛出异常 "100"正确   "a"抛出异常
     静态方法：
        static Integer valueOf(int i)返回一个int值的Integer实例
        static Integer valueOf(String s)返回保存指定的String的值的Integer对象
拆箱：在包装类中取出基本类型的数据（包装类->基本类型的数据）
     成员方法：
        int intValue()以int类型返回该Integer的值

 * */

public class Demo01Integer {

    public static void main(String[] args) {
        //装箱：把基本类型的数据，包装到包装类中（基本数据类型->包装类）
        //构造方法
        Integer in1 = new Integer(1);//方法上有横线，说明方法过时了
        System.out.println(in1);// 1 --  重写了toString方法
        Integer in2 = new Integer("10");
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);
        Integer in4 = Integer.valueOf("10");
        System.out.println(in4);

        //拆箱：在包装类中取出基本类型的数据（包装类->基本类型的数据）
        //成员方法
        int i = in4.intValue();
        System.out.println(i);
    }
}
