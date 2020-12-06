package com.xpzt.day03.demo01;

public class Demo01ArrayReverse {
    public static void main(String[] args) {  //逆序输出
        int[] array = {10, 20, 30, 40, 50};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("==================");

        int left = 0;
        int right = array.length - 1;
        while (left < right) {   //左下标小于右下标时循环
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
