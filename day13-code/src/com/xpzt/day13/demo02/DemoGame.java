package com.xpzt.day13.demo02;

public class DemoGame {
    public static void main(String[] args) {

        //创建一个英雄对象
        Hero hero = new Hero();
        hero.setName("艾希");
        //使用匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("biubiubiu~");
            }
        };
        hero.setSkill(skill);
        hero.attck();
    }
}
