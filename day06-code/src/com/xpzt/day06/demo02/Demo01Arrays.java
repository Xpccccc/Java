package com.xpzt.day06.demo02;

import java.util.Arrays;

public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        String str1 = Arrays.toString(intArray);//将参数数组变成字符串
        System.out.println(str1);
        int[] arrayOne = {2, 3, 5, 2, 342, 53, 234, 6};
        Arrays.sort(arrayOne);//按照默认升序对数组的元素进行排序
        System.out.println(Arrays.toString(arrayOne));
    }
}
