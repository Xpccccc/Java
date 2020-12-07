package com.xpzt.day05.demo04;

import java.util.Scanner;

/*
 * 键盘输入一个字符串，并且统计其中各种字符串出现的次数
 * 种类有：大写字母，小写字母，数字，其他字符
 * */
public class Demo08StringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：>");
        String input = sc.next();//输入字符串
        char[] charArray = input.toCharArray();

        int countUpper = 0;//大写字母个数
        int countLower = 0;//小写字母个数
        int countNum = 0;//数字
        int countOther = 0;//其他字符

        //遍历数组
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' < ch && ch < 'Z') {
                countUpper++;
            } else if ('a' < ch && ch < 'z') {
                countLower++;
            } else if ('0' < ch && ch < '9') {
                countNum++;
            } else {
                countOther++;
            }
        }

        System.out.println("大写字个数 ：" + countUpper + "， 小写字母个数 ：" +
                countLower + "，数字个数 ： " + countNum + "， 其他字符个数 ：" + countOther);

    }
}
