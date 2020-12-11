package com.xpzt.day09.demo01;

public interface MyInterfacePrivateA {

    public default void methodDefault1() {
        System.out.println("默认方法1");
        methodCommon1();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
        methodCommon1();
    }

    public static void methodDefault3() {
        System.out.println("静态方法3");
        methodCommon2();
    }

    public static void methodDefault4() {
        System.out.println("静态方法4");
        methodCommon2();
    }

    private void methodCommon1() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    private static void methodCommon2() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
