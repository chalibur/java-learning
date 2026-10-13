package com.itheima.literl.controllerloop;

import java.util.Scanner;

public class BreakDemo2 {
    /*
    需求：初始最大生命200，受到x点上海，技能恢复Y点血，X和Y有键盘录入
    假设，游戏人物不会死亡，最少一点血
    问：最终游戏人物血量是多少？
     */
    public static void main(String[] args){
        int hp=200;
        //键盘录入一个值，表示该人物受到的伤害

        Scanner sc=new Scanner(System.in);

        //循环+break
        //一直录入数据直到数据符合要求，不为负数
        int hurt=0;
        while(true){
            System.out.println("请输入当前人物受到的伤害：");
             hurt=sc.nextInt();
            if(hurt>=0)
            {
                break;
            }
            else{
                System.out.println("输入的伤害值不能为负数，请重新输入");
            }

        }

        //计算当前血量
        hp=hp-hurt;
        if(hp<1){
            hp=1;
        }
        System.out.println("当前人物的血量是"+hp);

        //键盘录入一个值，表示技能回复的血量
        int add;
        while(true){
            System.out.println("请输入当前人物技能恢复的血量：");
           add=sc.nextInt();
            if(add>0)
                break;
            else{
                System.out.println("输入的恢复值不能为负数，请重新输入");
            }
        }


        //计算当前人物的血量：
        hp+=add;
        if(hp>200){
            hp=200;

        }
        System.out.println("当前人物的血量是"+hp);
    }
}
