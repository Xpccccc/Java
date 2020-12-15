package com.xpzt.day12.demo03;

public class Body {//外部类

    public class Heart {//成员内部类

        //内部类的方法
        public void heat() {
            System.out.println("心脏跳动，滴滴滴");
            System.out.println("我叫：" + name);
        }
    }

    //外部类的成员方法
    private String name;

    //外部类的方法
    public void method() {
        System.out.println("外部类方法");
        //使用匿名对象
        new Heart().heat();
    }

    public Body(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
