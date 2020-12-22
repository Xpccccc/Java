package com.xpzt.day15.demo02;

/*
 * 含有泛型的接口，第一种使用方式：定义接口的实现类，实现接口，指定接口的泛型
 * public interface Iterator<E> {
 *       E next();
 * }
 *Scanner类实现了Iterator接口，并在指定接口的泛型为String，使用重写的next方法的泛型默认为String
 * public final class Scanner implements Iterator<String>{
 *       public String next();
 * }
 * */
public class GenericInterfaceImpl1 implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
