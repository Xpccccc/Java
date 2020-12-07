package com.xpzt.day05.demo04;

public class Demo03StringGet {

    public static void main(String[] args) {
        //字符串长度
        int length = "fhskjdhfkjsdhfsdkj".length();
        System.out.println("字符串长度是： " + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=============");

        //获取指定索引位置的单个字符

        char ch = "Hello".charAt(4);
        System.out.println("第4个索引字符是：" + ch);
        System.out.println("=============");

        //查找参数字符串在本字符串当中首次出现的索引位置
        //如果没找到，返回-1
        int index = "HelloWorldHelloWorld".indexOf("llo");
        System.out.println("字符串的索引位置是 ：" + index);

        System.out.println("==============");
        System.out.println("hello".indexOf("hh"));
    }
}
