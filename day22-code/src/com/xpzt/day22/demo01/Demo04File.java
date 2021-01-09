package com.xpzt.day22.demo01;

import java.io.File;

/*
 * File判断功能的方法
 *       public boolean exists(): 此File表示的文件或目录是否真实存在
 *       public boolean isDirectory(): 此File表示的是否为目录
 *       public boolean isFile(): 此File表示的是否为文件
 * */
public class Demo04File {
    public static void main(String[] args) {
        show01();
    }

    /*
    *  public boolean isDirectory(): 此File表示的是否为目录
    *       用于判断构造方法中给定的路径是以文件夹结尾
    *           是：true
    *           否：false
    *  public boolean isFile(): 此File表示的是否为文件
    *       用于判断构造方法中给定的路径是以文件结尾
     *           是：true
     *           否：false
     * 注意：
     *      电脑的硬盘中的只有文件/文件夹，两个方法互斥
     *      这两个方法的使用前提，路径必须是存在的，否则都返回false
    * */
    private static void show02() {
        File f1 = new File("C:\\Users\\Xpzt\\Pictures\\Screen");
        //不存在，就没必要获取
        if(f1.exists()){
            System.out.println(f1.isDirectory());//false
            System.out.println(f1.isFile());//false
        }

        File f2 = new File("C:\\Users\\Xpzt\\Pictures\\Screenshots");
        if(f2.exists()){
            System.out.println(f2.isDirectory());//true
            System.out.println(f2.isFile());//false
        }

        File f3 = new File("C:\\Users\\Xpzt\\Pictures\\Screenshots\\1.png");
        if(f2.exists()){
            System.out.println(f3.isDirectory());//false
            System.out.println(f3.isFile());//true
        }
    }

    /*
     * public boolean exists(): 此File表示的文件或目录是否真实存在
     * 用于判断构造方法中的路径是否存在
     *       存在：true
     *       不存在：false
     * */
    private static void show01() {
        File f1 = new File("C:\\Users\\Xpzt\\Pictures\\Screenshots");
        System.out.println(f1.exists());//true

        File f2 = new File("C:\\Users\\Xpzt\\Pictures\\Screen");
        System.out.println(f2.exists());//false

        File f3 = new File("1.png");//相对路径  C:\Users\Xpzt\Pictures\Screenshots
        System.out.println(f3.exists());//true

        File f4=new File("2.png");
        System.out.println(f4.exists());//false
    }
}
