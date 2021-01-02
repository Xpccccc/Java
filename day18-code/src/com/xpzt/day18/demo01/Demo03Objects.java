package com.xpzt.day18.demo01;

import java.util.Objects;

/*
 * Objects类中的静态方法
 * public static <T> T requireNonNUll(T obj):查看指定引用对象是不是null
 * 源码：
 *       public static <T> T requireNonNUll(T obj){
 *           if(obj == null)
 *               throw new NullPointerException();
 *           return obj;
 *       }
 * */
public class Demo03Objects {
    public static void method(Object obj) {
        //对传递过来的参数进行合法性判断，判断是否为null
        /*if (obj == null) {
            throw new NullPointerException("传递的对象的值是null");
        }*/
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象的值是null");
    }

    public static void main(String[] args) {
        method(null);
    }
}


