package com.xpzt.day05.demo02;

import java.util.ArrayList;

/*如果希望向集合ArrayList当中存储基本数据类型，必须使用对应的包装类
 *  基本类型     包装类（引用类型，全都位于java.lang包下）
 * byte         Byte
 * short        Short
 * int          Integer  【重点】
 * long         Long
 * float        Float
 * double       Double
 * char         Charater  【重点】
 * boolean      Boolean
 * */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("傻逼");
        System.out.println(listA.get(0));
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        System.out.println(listB);
        System.out.println("第1个索引元素 ：" + listB.get(1));
    }
}
