package com.itheima.oppextendstest6;

public class Student {
    String name;
    int age;

    public Student() {
        this("同学", 18);
        //调用本类中其他的构造方法
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
