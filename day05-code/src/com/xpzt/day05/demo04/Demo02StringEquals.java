package com.xpzt.day05.demo04;

public class Demo02StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("===============");

        String str4 = "shab";
        System.out.println("shab".equals(str4));//推荐推荐这样写 ，防止空指针异常
        String str5 = "ShaB";
        System.out.println("shab".equalsIgnoreCase(str5));//equalsIgnoreCase判断不分大小写
        System.out.println(str4.equalsIgnoreCase(str5));//equalsIgnoreCase判断不分大小写,进行内容比较

    }
}
