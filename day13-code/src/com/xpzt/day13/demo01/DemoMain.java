package com.xpzt.day13.demo01;

public class DemoMain {

    public static void main(String[] args) {

        //创建一个英雄名字
        Hero hero = new Hero();
        //设置英雄年龄
        hero.setAge(20);
        //设置英雄名字
        hero.setName("盖伦");
        //设置英雄武器
        Weapon weapon = new Weapon("刀");
        hero.setWeapon(weapon);
        hero.show();

        hero.setWeapon(new Weapon("菜刀"));
        hero.show();
    }
}
