package com.xpzt.day05.demo04;

public class Demo01String {

    public static void main(String[] args) {

        //三种构造方法
        String str1 = new String();
        System.out.println("字符串 ：" + str1);

        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println(str2);

        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println(str3);

        //一种直接创建
        String str4 = "sbbb";
        System.out.println(str4);
    }
}
