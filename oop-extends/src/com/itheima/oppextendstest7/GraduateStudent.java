package com.itheima.oppextendstest7;

public class GraduateStudent extends Student {
    //构造方法


    public GraduateStudent() {
    }

    public GraduateStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    //成员方法，需要重写，硕士研究生攻读硕士学位

    @Override
    public void study() {

        System.out.println("硕士研究生攻读硕士学位");
    }
}
