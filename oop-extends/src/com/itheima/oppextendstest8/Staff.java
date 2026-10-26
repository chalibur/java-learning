package com.itheima.oppextendstest8;

import java.sql.SQLOutput;

public class Staff {
    private String name;//姓名
    private int number;//工号
    private int salary;//工资

    //构造函数
    public Staff() {
    }

    public Staff(String name, int number, int salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    //方法函数


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("在工作");
    }
    public void eat(){
        System.out.println("在吃饭（米饭）");
    }
}
