package com.xpzt.day13.demo01;

//游戏当中的英雄角色类
public class Hero {
    private String name;//英雄名字
    private Weapon weapon;//武器名称
    private int age;//年龄

    public void show() {
        System.out.println(age + "岁的" + name + "拿着" + weapon.getCode());
    }

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
