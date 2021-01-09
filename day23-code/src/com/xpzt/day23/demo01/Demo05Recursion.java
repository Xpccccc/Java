package com.xpzt.day23.demo01;

import java.io.File;

/*
 * 练习:
 *   递归打印多级目录
 * 需求:
 *   遍历C:\abc文件夹,及abc文件夹的子文件夹
 *
 *   只要.java结尾的文件
 *
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
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("C:\\abc");
        getAllFile(file);
    }

    /*
     * 定义一个方法,参数传递File类型的目录
     * 方法中对目录进行遍历
     * */
    public static void getAllFile(File dir) {
        //System.out.println(dir); //打印被遍历的目录名称
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

                /*
                 * C:\abc\abc.java
                 * 只要.java结尾的文件
                 * 1.把File对象f,转换为字符串对象  abc.java
                 * */

                //String name = f.getName();//abc.java
                //String path = f.getPath();//C:\abc\abc.java
                /*String s = f.toString();//C:\abc\abc.java

                //把字符串转换为小写
                String s1 = s.toLowerCase();

                //2.调用String类中的方法endsWith法判断字符串是否以.java结尾
                boolean b = s1.endsWith(".java");

                //3.如果是以.java结尾的文件,则输出
                if (b) {
                    System.out.println(f);
                }*/
                //链式编程
                if(f.toString().toLowerCase().endsWith(".java")){
                    System.out.println(f);
                }
            }
        }
    }
}
