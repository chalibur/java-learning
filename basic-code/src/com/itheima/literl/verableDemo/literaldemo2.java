package com.itheima.literl.verableDemo;

public class literaldemo2 {
    public static void main(String[] args) {
        //定义变量来记录我方的攻击力
        int attack1 =220;
        //定义记录我方的防御力
        int defence1=85;
        //记录我方的血量
        double blood1=1012.5;
        //记录我方的技能加成
        double skill1 =1.2;
        //定义的变量定义对方的攻击力
        int attack2=210;
        //定义对方的防御力
        int defence2=80;
        //定义对方的血量
        double blood2 =1223.3;
        //定义对方的技能加成
        double skill2=1.3;
//我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
        //普攻造成伤害公式：攻击力-对方防御力
        double damage1 = attack1 - defence2;
        //对方还剩余多少血量
        double blood2AfterDamage1 = blood2 - damage1;
        System.out.println(blood2AfterDamage1);
        //我方第二次进行攻击，造成多少伤害，对方还剩余多少血量？
        //普攻造成伤害公式：攻击力*技能加成-对方防御力
        double damage2=attack1*skill1-defence2;
        double blood2AfterDamage2 = blood2AfterDamage1 - damage2;
        System.out.println(blood2AfterDamage2);


    }
}
