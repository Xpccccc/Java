package com.xpzt.day05.demo04;

public class Demo04StringSubstring {

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);//World
        System.out.println(str2);
        System.out.println("==========");
        String str3 = str1.substring(4, 7);//oWo
        System.out.println(str3);

        System.out.println("============");


        //下面两种写法，字符串的内容没有发生改变
        //strA保存的是地址值
        //原来地址值是Hello的0x666
        //后来地址变成了Java的0x999

        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);
    }
}
