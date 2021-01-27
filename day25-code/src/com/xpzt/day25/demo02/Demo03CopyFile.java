package com.xpzt.day25.demo02;

import java.io.*;

/*
 * 文件复制练习:一读一写
 *
 * 明确:
 *       数据源:c:\\1.jpg
 *       目的地:d:\\jpg
 * 文件复制的步骤:
 *       1.创建字节缓冲输入流对象,构造方法中传递字节输入流
 *       2.创建字节缓冲输出流对象,构造方法中传递字节输出流
 *       3.使用字节缓冲输入流对象中的方法read,读取文件
 *       4.使用字节缓冲输出流中对象的方法write,把读取到的数据写入到内部缓冲区
 *       5.释放资源(会先把缓冲区中的数据,刷新到文件中)
 *
 * 文件的大小 2,679,652 字节
 * 一次读写一个字节:97ms
 * 使用数组缓冲读取多个字节,写入多个字节:34ms
 * */
public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        //1.创建字节缓冲输入流对象,构造方法中传递字节输入流
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("c:\\1.jpg"));
        //2.创建字节缓冲输出流对象,构造方法中传递字节输出流
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("d:\\1.jpg"));
        //3.使用字节缓冲输入流对象中的方法read,读取文件
        int len = 0;//记录每次读取到的字节
        //4.使用字节缓冲输出流中对象的方法write,把读取到的数据写入到内部缓冲区
       /* while ((len = fis.read()) != -1) {
            fos.write(len);
        }*/
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
        long e = System.currentTimeMillis();
        System.out.println("共耗时" + (e - l) + "毫秒");
    }
}
