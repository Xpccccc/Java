package com.xpzt.day24.demo05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * JDK7新特性
 * 在try后边可以增加一个(),在括号中可以定义流对象
 * 那么这个流对象的作用作用域就在try中有效
 * try中的代码执行完毕,会自动把流对象释放,不用写finally
 * 格式:
 *       try(定义流对象;定义流对象...){
 *           可能出现异常的代码
 *       }catch(异常类变量 变量名){
 *           异常的处理逻辑
 *       }
 * */
public class Demo06JDK7 {
    public static void main(String[] args) {
        try (//1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
             FileInputStream fis = new FileInputStream("C:\\1.jpg");
             //2.创建一个字节输出流对象,构造方法中绑定要写入的数据源
             FileOutputStream fos = new FileOutputStream("D:\\1.jpg");) {
            //一次读取一个字节写入一个字节的方式
            //3.使用字节输入流对象中的方法read文件对象
            int len = 0;
            while ((len = fis.read()) != -1) {
                //4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
                fos.write(len);
            }
            //5.释放资源(先关写的,后关读的,如果写完了,肯定读完了)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
