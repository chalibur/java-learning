package com.itheima.oppextendstest7;

public class Teacher extends Person {


    //构造函数

    public Teacher() {
        super();
    }

    public Teacher(String name, int age) {
        super(name, age);

    }
    //成员方法
    public void Teach(){
        System.out.println("正在教书");
    }

}
