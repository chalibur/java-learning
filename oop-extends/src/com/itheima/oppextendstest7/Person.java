package com.itheima.oppextendstest7;

public class Person {
    //成员变量
    String name;
    int age;

    //构造方法

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //成员方法
    public void Eat(){
        System.out.println("吃吃吃");
    }
    public void Sleep(){
        System.out.println("睡睡睡");
    }
}
