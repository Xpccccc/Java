package com.xpzt.day03.demo02;

/*
面向过程：当需要实现一个功能的时候，每个步骤需要亲力亲为，详细处理每一个细节
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，帮我做事
*/
import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("==============");

        //面向对象
        //找一个JDK给我们提供好的Arrays类
        //其中有一个tostring方法可以把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
