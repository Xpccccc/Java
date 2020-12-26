package com.xpzt.day16.Demo04;

/*
 * 可变参数：是JDK1.5之后出现的新特性
 * 使用前提：
 *   当方法的参数列表类型已经确定，但是参数的个数不确定，就可以使用可变参数
 * 使用格式：
 *   修饰符 返回值类型 方法名(数据类型...变量名){}
 * 可变参数的原理：
 *   可变参数的底层是一个数组，根据传递的参数不同，会创建不同长度的数组，来存储这些参数
 *   传递的参数个数，可以是0个（不传递）或者1,2..多个
 *
 * */
public class DemoVarArgs {

    public static void main(String[] args) {
//        int i = add();
        int i = add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.println(i);

        method("abc",3.4,3,1,3,4,5,6,7,4);
    }

    /*
    * 可变参数的注意事项：
    *   1.一个方法的参数列表，只能有一个可变参数
    *   2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
    * */
//    public static void method(String s,double b,int i,int...arr){
//    }

    /*
    * 可变参数的特殊写法（终级写法）
    * */

    public static void method(Object...obj){

    }

    /*
     * 定义计算（0-n）整数和的方法
     * 已知：计算整数的和，数据类型已经确定int
     * 但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
     * add();就会创建一个长度为0的数组，new int[0]
     * add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);就会创建一个长度为10的数组，new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
     * */

    public static int add(int... arr) {
//        System.out.println(arr);
//        System.out.println(arr.length);
        //定义一个初始化的变量，记录累加求和
        int sum = 0;
        //遍历数组
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
