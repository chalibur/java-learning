package com.itheima.oppextendstest7;

public class undergraduate extends Student {
    //构造方法

    public undergraduate() {
    }

    public undergraduate(String name, int age, String grade) {
        super(name, age, grade);
    }
    //成员方法，需要重写，本科生攻读学士学位

    @Override
    public void study() {

        System.out.println("本科生攻读学士学位");
    }
}
