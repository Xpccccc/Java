package com.xpzt.day06.demo02;

import java.util.Arrays;

/*请使用Arrays类相相关的API，将一个随机字符串的所有字符升序排列，倒序输出
 * */
public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "dhjsfjkh3wkj45h3wecjkv90uf";
        char[] chars = str.toCharArray();//将字符串变成数组
        Arrays.sort(chars);//字符升序排序
        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }


    }
}
