package com.xpzt.day25.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * java.io.BufferedWriter extends Writer
 * BufferedWriter:字符缓冲输入流
 *
 * 继承自父类的成员方法:
 *      public void close(): 关闭此输出流并释放与此流相关联的任何系统资源
 *      public void flush(): 刷新此输出流并强制任何缓冲的输出字节被写出
 *      public void write(char[] cbuf): 写入字符数组
 *      public abstract void write(String str,int off,int len): 写入字符串的某一部分,off字符串开始的索引,len写的字符个数
 *      public void write(char[] cbuf,int off,int len): 写入字符数组的某一部分,off字符串开始的索引,len写的字符个数
 *      void write(int c): 写入单个字符
 *      void write(String str) 写入字符串
 *
 * 构造方法:
 *       BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流
 *       BufferedWriter(Writer out ,int sz) 创建一个使用给定大小输出缓冲区的新缓冲字符输出流
 *       参数:
 *           Writer out:字符输出流
 *                   我们可以传递FileWriter,缓冲流会给FileWriter增加一个缓冲区,提高FileWriter的写入效率
 *           int sz:指定缓冲流内部缓冲区的大小,不指定默认
 *
 * 特定的成员方法:
 *      void newLine() 写入一个行分隔符.会根据不同的操作系统,获取不同的行分隔符
 *      换行:换行符号
 *      windows:\r\n
 *      linux:/n
 *      mac:/r
 *
 * 使用步骤:
 *       1.创建字符缓冲输出流对象,构造方法中绑定要读取的数据源
 *       2.调用字符缓冲输出流中的方法write,把数据写入到内存缓冲区中
 *       3.使用字符缓冲输出流中的方法flush,把内存缓冲区中的数据,刷新到文件中
 *       4.释放资源
 * */
public class Demo01BufferedWriter {
    public static void main(String[] args) throws IOException {
        //1.创建字符缓冲输出流对象,构造方法中绑定要读取的数据源
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\basic-code\\h.txt"));
        //2.调用字符缓冲输出流中的方法write,把数据写入到内存缓冲区中
        for (int i = 0; i < 10; i++) {
            bw.write("陈浩");
            //bw.write("\r\n");
            bw.newLine();
        }
        //4.释放资源
        bw.close();

    }
}
