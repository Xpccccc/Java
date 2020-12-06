package com.xpzt.day03.demo01;

public class Demo01ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 10, 30, 20, 10000};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值：" + max);

    }
}
