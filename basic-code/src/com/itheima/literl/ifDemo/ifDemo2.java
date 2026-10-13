package com.itheima.literl.ifDemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifDemo2 {
    /*
    需求：初始最大生命200，收到x点伤害，技能回复Y点，X和Y由键盘录入而来，假设，游戏人物不会
    死亡，最少一点血，问：最终游戏人物血量是多少？
     */
    public static void main(String[] args){
        int hp=200;
        //键盘录入一个值，表示该人物受到的伤害

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入当前人物受到的伤害：");
        int hurt=sc.nextInt();

        //计算当前血量
        hp=hp-hurt;
        if(hp<1){
            hp=1;
        }
        System.out.println("当前人物的血量是"+hp);

        //键盘录入一个值，表示技能回复的血量

        System.out.println("请输入当前人物技能恢复的血量：");
        int add=sc.nextInt();

        //计算当前人物的血量：
        hp+=add;
        if(hp>200){
            hp=200;
        }
     }

}
