package com.xpzt.day13.demo02;

public class Hero {
    private String name;//英雄名字
    private Skill skill;//释放技能

    public void  attck(){
        System.out.println(name+"在使用：");
        skill.use();
        System.out.println("攻击");
    }
    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
