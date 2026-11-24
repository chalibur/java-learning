package com.itheima.ui;

import com.itheima.domain.EnemyCharacter;
import com.itheima.domain.HeroCharacter;


import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.ArrayList;
import java.util.Random;
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

        //准备战斗
        int count=0;//统计在和第几个敌人进行战斗
        int wins=0;
        //循环战斗，不断和不同的敌人进行战斗，直到我方的血条为0，游戏才结束
        Random r = new Random();
        while (player.isAlive()){
            //每场战斗开始前，第二场起强化敌人属性
            count++;
            if (count > 1) {
                for (int i = 0; i < enemyList.size(); i++) {
                    EnemyCharacter c = enemyList.get(i);
                    c.maxHP += 10;
                    c.attack += 3;
                    c.defence += 2;
                    c.HP = c.maxHP;
                    c.defending = false;
                }
            }

            //本场战斗只随机选取一个敌人（放在回合循环之外，避免每回合换人）
            int index = r.nextInt(enemyList.size());
            EnemyCharacter enemy = enemyList.get(index);

            System.out.println("═══════════════════════════════════════");
            System.out.println("第"+count+"场战斗开始！对手："+enemy.name);
            System.out.println(enemy.show());

            //内层循环：与当前这个敌人打多个回合，直到一方倒下
            int round=1;
            while(enemy.isAlive() && player.isAlive()){
                System.out.println("--------------------------------------");
                System.out.println("第"+round+"回合开始");

                //显示双方状态
                System.out.println(getHealthBar(player.name,player.HP,player.maxHP));
                System.out.println(getHealthBar(enemy.name,enemy.HP,enemy.maxHP));

                //玩家回合
                playerTurn(player,enemy);

                //（此处可扩展敌方回合逻辑：enemy 攻击 player）
                enemyTurn(enemy,player);

                round++;
            }
            //战斗结算
            // 跟一个敌人的战斗结束之后
            if (!enemy.isAlive()){
                wins++;
                System.out.println("🎉 你击败了 "+enemy.name+"！累计胜利 "+wins+" 场");
                player.heal(30);//可选：战后回血
            }else{
                System.out.println("💀 你被 "+enemy.name+" 击败，游戏结束！");
            }
        }



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
    public String getHealthBar(String name,int HP,int maxHP){
        int barlength=20;
        int filled=(int)(HP*1.0/maxHP*barlength);
        StringBuilder sb=new StringBuilder();
        sb.append(name+"[");
        for (int i = 0; i < filled; i++) {
            sb.append("█");
        }
        for (int i = 0; i < barlength - filled; i++) {
            sb.append(" ");
        }
        sb.append("] "+HP+"/"+maxHP);
        return sb.toString();
    }
    //玩家回合
    public void playerTurn( HeroCharacter player,EnemyCharacter enemy){
        System.out.println("══════════════════ 你的回合 ═════════════════");
        System.out.println("请选择行动：1.普通攻击2.强力一击3.生命汲取");
        Scanner sc =new Scanner(System.in);
        int input =sc.nextInt();
        switch(input) {
            default:
                System.out.println("无效输入，默认普通攻击");
                case 1:
                System.out.println("1.普通攻击");
                //我方的攻击力-敌方的防御力=伤害
                    int damage = calculateDamage(player.attack, enemy.defence);
                    System.out.println("⚔\uFE0F你对敌人"+enemy.name+"造成了"+damage+"点伤害");
                    enemy.takeDamage(damage);
                break;
            case 2:
                System.out.println("2.强力一击");
                if(player.HP>10){
                    player.takeDamage(10);
                    int damage2 = calculateDamage(((int) (player.attack * 1.8)), enemy.defence);
                    System.out.println("💥 消耗10HP，你对 "+enemy.name+" 使用了强力一击，造成 "+damage2+" 点伤害！");
                    enemy.takeDamage(damage2);
                }
                else {
                    System.out.println("你的生命值不足，无法使用强力一击");
                }
                break;
            case 3:
                System.out.println("3.生命汲取");
                if(player.HP>10)
                {
                   player.takeDamage(10);
                   //计算给自己恢复的血量，采用0-20的随机
                    Random r=new Random();
                    int heal=r.nextInt(1,21);
                    player.heal(heal);
                    System.out.println("🎉 消耗10HP，你使用了生命汲取，你恢复了 "+heal+" 点生命值！");
                }
                else{
                    System.out.println("你的生命值不足，无法使用生命汲取");
                }
                break;
        }
    }
    //敌人回合
    public void enemyTurn(EnemyCharacter enemy,HeroCharacter player ){
        System.out.println("════════════"+enemy.name+"的回合开始了 ═══════════════");
        //首先先要判断百分十五十的概率使用普通攻击，百分之五十的概率使用技能
        //如果敌人使用技能，又需要判断是什么英雄，因为每个英雄的技能都不一样
        Random r=new Random();
        int choice=r.nextInt(2);
        if(choice==0){
            int damage=calculateDamage(enemy.attack,player.defence);
            player.takeDamage(damage);
            System.out.println(enemy.name+"使用了普通攻击,对你造成了"+damage+"点伤害");
        }else{
            String action=enemy.skill;
            switch (action){
                case "猛击":
                    int damage1=calculateDamage((int) (enemy.attack*1.5),player.defence);
                    player.takeDamage(damage1);
                    System.out.println("⚔\uFE0F "+enemy.name+" 对你使用了猛击，造成 "+damage1+" 点伤害！");
                    break;
                case "快速攻击":
                    int damage2=calculateDamage((int) (enemy.attack*2),player.defence);
                    player.takeDamage(damage2);
                    System.out.println("💥 "+enemy.name+" 对你使用了快速攻击，造成 "+damage2+" 点伤害！");

                    break;
                case "防御姿态":
                    enemy.defending = true;//敌人使用防御姿态，下回合伤害减半
                    System.out.println("🛡️ "+enemy.name+" 使用了防御姿态，下回合伤害减半！");
                    break;
                case "火球术":
                    int damage3=calculateDamage((int) (enemy.attack*1.8),player.defence);
                    player.takeDamage(damage3);
                    System.out.println("🔥 "+enemy.name+" 对你使用了火球术，造成 "+damage3+" 点伤害！");
                    break;
            }
        }
    }
    //普通攻击的计算伤害工具
    public int calculateDamage(int attack, int defence) {
        //攻击力-防御力=伤害
        if(attack>defence){
            return attack - defence;
        } else {
            return 0;
        }
    }
}
