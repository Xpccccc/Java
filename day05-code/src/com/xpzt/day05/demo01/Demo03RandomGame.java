package com.xpzt.day05.demo01;

import java.util.Random;
import java.util.Scanner;

//猜数字游戏

public class Demo03RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;//随机数 1~100
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入你猜的数字：");
            int guessNum = sc.nextInt();
            if (guessNum == randomNum) {
                System.out.println("猜对了");
                break;
            } else if (guessNum > randomNum) {
                System.out.println("猜大了");

            } else {
                System.out.println("猜小了");
            }

        }
    }

}
