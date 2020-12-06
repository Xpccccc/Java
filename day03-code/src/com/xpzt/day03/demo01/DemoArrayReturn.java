package com.xpzt.day03.demo01;

public class DemoArrayReturn {
    public static void main(String[] args) {
        int a = 10;
        int b = 20, c = 30;
        int[] result = caculate(a, b, c);

        System.out.println("和为：" + result[0]);
        System.out.println("平均数为：" + result[1]);
    }

    //数组作为方法的返回值
    public static int[] caculate(int a, int b, int c) {
        int sum = a + b + c;//和
        int avg = sum / 3;//平均数
        int[] array = {sum, avg};
        return array;
    }
}
