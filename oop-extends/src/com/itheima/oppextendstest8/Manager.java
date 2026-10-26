package com.itheima.oppextendstest8;

public class Manager extends Staff{
    private int bonus;//管理奖金

    //构造函数

    public Manager() {

    }

    public Manager(String name, int number, int salary, int bonus) {
        super(name, number, salary);
        this.bonus = bonus;
    }
    //方法函数，需要改写，工作的主要内容是管理其他


    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("在管理其他员工");
    }
}
