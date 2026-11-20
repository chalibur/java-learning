package com.itheima.domain;

public class EnemyCharacter extends Character {
    public String skill;
    public boolean defending;

    public EnemyCharacter() {
    }

    public EnemyCharacter(String skill) {
        this.skill = skill;
    }

    public EnemyCharacter(String name, int HP, int attack, int defence, String skill) {
        super(name, HP, attack, defence);
        this.skill = skill;
    }

    @Override//由于敌方英雄有防御机制，所以重写takeDamage方法
    public void takeDamage(int damage) {
        //收到的伤害等于攻击力减去防御力
        if (defending){
            damage=damage/2>1?damage/2:1;
        }
        defending=false;
        //收到的最小伤害为1点
        //技能的伤害为攻击力*n%-防御力
        super.takeDamage(damage);
    }
}
