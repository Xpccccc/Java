package com.xpzt.day03.demo01;

public class Demo01ArrayMin {
    public static void main(String[] args) {
        int[] array = {5, 10, 30, 20, -20, 10000};

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("最小值：" + min);

    }
}
