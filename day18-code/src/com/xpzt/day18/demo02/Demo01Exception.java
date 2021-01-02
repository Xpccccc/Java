package com.xpzt.day18.demo02;

import java.util.List;

/*
 * 异常的注意事项
 * */
public class Demo01Exception {

    public static void main(String[] args) {
        /*
         * 多个异常使用捕获又该如何处理呢？
         * 1.多个异常分别处理。
         * 2.多个异常一次捕获，多次处理
         * 3.多个异常一次捕获，一次处理
         * */

        //1.多个异常分别处理。
        /*try{
            int[] arr={1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/

        //2.多个异常一次捕获，多次处理
        /*try {
            int[] arr = {1, 2, 3};
            //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));//IndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }*/
        /*
         * 一个try多个catch注意事项：
         *   catch里边定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则就会报错
         *       ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         * */

        //3.多个异常一次捕获，一次处理
        /*try {
            int[] arr = {1, 2, 3};
            //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));//IndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e);
        }*/

        //运行时异常被抛出可以不处理，即不捕获也不声明抛出
        //默认个虚拟机处理，终止程序，什么时候不抛出异常了，再来继续执行程序
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        List<Integer> list = List.of(1, 2, 3);
        System.out.println(list.get(3));//IndexOutOfBoundsException
        System.out.println("后续代码");
    }
}
