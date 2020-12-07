package com.xpzt.day05.demo03;

import java.util.ArrayList;

/*
 * 定义以指定格式打印集合的方法（ArrayList类型作为参数）用{}括起集合，每个元素用@分隔开
 * */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("里斯更");
        list.add("就看看");
        list.add("陈浩");
        arrayListParam(list);
    }

    public static void arrayListParam(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {//最后一个元素不加@
                System.out.print(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }
}
