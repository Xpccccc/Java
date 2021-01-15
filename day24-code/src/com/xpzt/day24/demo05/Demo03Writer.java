package com.xpzt.day24.demo05;

import java.io.FileWriter;
import java.io.IOException;

/*
 *   字符输出流写数据的其他办法:
 *       void write(char[] cbuf) 写入字符数组
 *       abstract void write(char[] cbuf,int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数
 *       void write(String str) 写入字符串
 *       void write(String str,int off,int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数
 *
 * */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\IdeaProjects\\basic-code\\f.txt");
        //void write(char[] cbuf) 写入字符数组
        char[] cs={'a','b','c','d','e'};
        fw.write(cs);//abcde

        //abstract void write(char[] cbuf,int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数
        fw.write(cs,1,3);//bcd

        //void write(String str) 写入字符串
        fw.write("陈浩bbb");//陈浩bbb

        //void write(String str,int off,int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数
        fw.write("猪比aaa",1,3);//比aa

        fw.close();
    }
}
