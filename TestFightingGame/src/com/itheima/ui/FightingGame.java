package com.itheima.ui;

import com.itheima.domain.EnemyCharacter;
import com.itheima.domain.HeroCharacter;

import java.util.ArrayList;
import java.util.Scanner;

public class FightingGame {
    public void gameStart(String username){
        System.out.println("╔═══════════════════════════════╗");
        System.out.println(" 🎮"+username+"欢迎来到文字格斗游戏 🎮 ");
        System.out.println("╚═══════════════════════════════╝");
        System.out.println("请选择操作：1登录 2注册 3忘记密码");
        //创建玩家角色，包括名称以及属性分配
        HeroCharacter player=createPlayerCharacter(username);
        System.out.println("角色创建成功！");
        System.out.println("\uD83C\uDF1F 初始属性为："+player.show());
        System.out.println("\uD83C\uDF1F 初始技能为："+player.showSkills());

        //创建多个敌人列表
        /*敌人名称	生命值	攻击力	防御力	技能（变量）
        初级战士	80	15	10	猛击（150%伤害）
        敏捷刺客	60	20	5	快速攻击（2次50%伤害）
        重装坦克	120	10	20	防御姿态（下回合伤害减半） buff（ boolean defendding）
        神秘法师	70	25	8	火球术（180%伤害）
         */
        ArrayList<EnemyCharacter> enemyList=new ArrayList<>();
        enemyList.add(new EnemyCharacter("初级战士", 80, 15, 10, "猛击"));
        enemyList.add(new EnemyCharacter("敏捷刺客", 60, 20, 5, "快速攻击"));
        enemyList.add(new EnemyCharacter("重装坦克", 120, 10, 20, "防御姿态"));
        enemyList.add(new EnemyCharacter("神秘法师", 70, 25, 8, "火球术"));
    }
    public HeroCharacter createPlayerCharacter(String username){
        //结果就是创建好的玩家角色
        System.out.println("创建您的用户角色");
        System.out.println("您的角色名为："+username);
        //属性分配
        int point=20;

        System.out.println("您有"+point+"点属性点，可以分配给角色生命力，攻击力，防御力");
        Scanner sc=new Scanner(System.in);
        String attributes[]={"生命值","攻击力","防御力"};
        //定义数组记录三个属性分配的属性点
        int values[]=new int[3];
        //用一个循环分配属性值
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入"+attributes[i]+"的属性点："+"剩余点数为（"+point+"）:");
            int input=sc.nextInt();//表示当前用户键盘录入的属性点
            if(input<0){
                System.out.println("无效输入。默认为0");
                input=0;
            }
            if(input>point){
                System.out.println("超出属性点，属性点不足，全部属性点全部分配到"+attributes[i]);
                input=point;

            }
            point=point-input;
            values[i]=input;
        }

        HeroCharacter player=new HeroCharacter(
                username,
                100+values[0]*10,
                10+values[1]*2,
                0+values[2]*1
        );
        player.skillList.add("普通攻击");
        player.skillList.add("强力一击");
        player.skillList.add("生命汲取");

        return player;
    }
}
