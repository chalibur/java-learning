package com.itheima.oppextendstest5;

public class Teacher extends Person {
    String subject;//科目
    //构造函数


    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        //子类的subject语句需要自己加上
        this.subject = subject;
    }
}
