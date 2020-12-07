package com.xpzt.day05.demo04;

public class Demo05StringConvert {

    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        //将当前字符串拆分成字符数组作为返回值
        System.out.println(chars[0]);
        System.out.println("=============");

        //获得当前字符串底层的字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=============");

        //将所有出现的老字符串替换成新的字符串，返回替换之后的结果新字符串
        String str1 = "HelloWorld!".replace("o", "*");
        System.out.println(str1);
        System.out.println("你好菜啊，你大爷的！你大爷的！你大爷的！".replace("你大爷的", "****"));
    }
}
