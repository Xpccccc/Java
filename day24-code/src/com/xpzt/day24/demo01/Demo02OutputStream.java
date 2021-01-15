package com.xpzt.day24.demo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * 一次写多个字节的方法
 *       public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
 *       public void write(byte[] b,int off, int len):从指定的字节数组写入len字节,从偏移量off开始输出到此输出流
 * */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\basic-code\\b.txt");
        /*
         * public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
         * 一次写多个字节
         *      如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII
         *      如果写的第一个字节是负数,那么第一个字节和第二个字节,两个字节组成一个中文显示,查询系统默认码表(GBK)
         * */
        byte[] bytes = {65, 66, 67, 68, 69};//ABCDE
        //byte[] bytes = {-65, -66, -67, 68, 69};//烤紻E
        fos.write(bytes);

        /*
         * public void write(byte[] b,int off, int len):把字节数组的一部分写到文件中
         *      int off:数组的开始索引
         *      int len:写几个字节
         * */

        fos.write(bytes, 1, 2);//BC

        /*
        * 写入字符的方法:可以使用String类中的方法,把字符串转换为字节数组
        *       byte[] getBytes():把字符串转换为字节数组
        * */

        byte[] bytes1 = "你好".getBytes();//[-28, -67, -96, -27, -91, -67]
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);

        //释放资源
        fos.close();

    }
}
