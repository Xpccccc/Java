package com.xpzt.day12.demo04;

//局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是{有效final的}
//加final关键字或者不加final关键字就赋值唯一一次
public class MyOuter {

    public void methodOuter() {
        /*final*/int num;
        num = 10;
        class Inner {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
