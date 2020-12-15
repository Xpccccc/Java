package com.xpzt.day12.demo03;


//如果出现了重名 现象，那么格式是 ：外部类.this.外部成员变量名
public class Outer {

    int num = 30;//外部成员变量

    public class Inner {

        int num = 20;//内部成员变量

        public void method() {
            int num = 10;//内部类方法的局部变量
            System.out.println(num);//局部变量，就近原则
            System.out.println(this.num);//内部类的成员变量
            System.out.println(Outer.this.num);//外部类的成员变量

        }
    }
}
