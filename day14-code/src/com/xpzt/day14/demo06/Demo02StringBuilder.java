package com.xpzt.day14.demo06;

/*
 * StringBuilder的常用方法：
 *   public StringBuilder append(...)添加任意数据类型的字符串形式，并返回对象自身
 * */
public class Demo02StringBuilder {

    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder("abc");
        //append返回的是this，调用方法的对象bu,this==bu
        StringBuilder bu1 = bu.append("def"); //把bu的地址赋值给了bu1

        System.out.println(bu);//abcdef
        System.out.println(bu1);//abcdef
        System.out.println(bu1 == bu);//比较的是地址  true


        //使用append无需接收返回值
        //链式编程：返回值是一个对象，可以继续调用方法
        bu.append("ghi").append("jkl").append("jkl");
        System.out.println(bu);
    }
}
