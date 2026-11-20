package com.itheima.domain;

public class Character {
    public String name;
    public int HP;
    public int maxHP;
    public int attack;
    public int defence;

    //构造方法

    public Character() {
    }

    public Character(String name, int HP, int attack, int defence) {
        this.name = name;
        this.HP = HP;
        this.maxHP = HP;//初始创建任务的时候maxHP就是HP，所以有参数的构造函数中没有maxHP
        this.attack = attack;
        this.defence = defence;
    }
    //判断现在的人物是否存活
    public boolean isAlive() {
        return HP > 0;
    }

    //回复血量
    //形参就是回了多少血
    public void heal(int ammount)
    {
        HP+=ammount;
        if (HP>maxHP) {
            HP=maxHP;
        }
    }
    //收到伤害
    public void takeDamage(int damage){
        HP-=damage;
        if (HP<0) {
            HP=0;
        }
    }
    //展示属性
    public String show(){
        return "名称:"+name+" ,血量:"+HP+" ,攻击:"+attack+" ,防御:"+defence;
    }

}
