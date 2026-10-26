package com.itheima.oppextendstest8;

public class cook extends Staff{
    //构造函数


    public cook() {
    }

    public cook(String name, int number, int salary) {
        super(name, number, salary);
    }
    //方法函数

    @Override
    public void work() {
        System.out.println("正在做饭");
    }
}
