package com.xpzt.day14.demo06;

/*
 * StringBuilder和String可以互换
 *   String->StringBuilder：可以使用StringBuilder的构造方法
 *       StringBuilder(String str)构造一个字符串生成器，并初始化为指定的字符串内容
 *   StringBuilder->String：可以使用StringBuilder的toString方法
 *          public String toString();将当前StringBuilder对象转换为String对象
 * */
public class Demo03StringBuilder {

    public static void main(String[] args) {
        //String->StringBuilder
        String str = "abc";
        System.out.println("str:"+str);
        StringBuilder str1 = new StringBuilder(str);
        //往StringBuilder中添加数据
        str1.append("def");
        System.out.println("str1:"+str1);

        //StringBuilder->String
        String str2 = str1.toString();
        System.out.println("str2:"+str2);
    }
}
