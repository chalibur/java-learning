package com.itheima.oppextendstest7;

public class GeneralTeacher extends Teacher{
    //构造方法

    public GeneralTeacher() {
    }

    public GeneralTeacher(String name, int age) {
        super(name, age);
    }
    //成员方法，需要改写，教通识课知识

    @Override
    public void Teach() {
        super.Teach();
        System.out.println("教通识课知识");
    }
}
