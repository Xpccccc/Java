package com.xpzt.day23.demo01;

import java.io.File;

/*
 * 练习:
 *   递归打印多级目录
 * 需求:
 *   遍历C:\abc文件夹,及abc文件夹的子文件夹
 *   C:\abc
 *   C:\abc\abc.txt
 *   C:\abc\abc.java
 *   C:\abc\a
 *   C:\abc\a\a.jpg
 *   C:\abc\a\a.java
 *   C:\abc\b
 *   C:\abc\b\b.txt
 *   C:\abc\b\b.java
 * */
public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("C:\\abc");
        getAllFile(file);
    }

    /*
     * 定义一个方法,参数传递File类型的目录
     * 方法中对目录进行遍历
     * */
    public static void getAllFile(File dir) {
        //打印被遍历的目录名称
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历得到的File对象f进行判断,判断是否文件夹
            if (f.isDirectory()) {
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
                //所以我们直接调用getAllFile方法即可:递归(自己调用自己)
                getAllFile(f);
            } else {
                //f是一个文件直接打印
                System.out.println(f);
            }
        }
    }
}
