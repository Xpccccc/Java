package com.xpzt.day05.demo04;

/*
 * 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串
 * 格式如下：[word1#word2#word3]
 * */
public class Demo07StringPractise {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        formArray(array);
    }

    public static void formArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print("word" + array[i] + "]");//int型强转为字符型
            } else {
                System.out.print("word" + array[i] + "#");
            }
        }
    }
}
