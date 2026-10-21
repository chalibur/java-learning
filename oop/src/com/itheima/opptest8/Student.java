package com.itheima.opptest8;

public class Student {
    private String name;
    private int age;

    //构造方法
    //alt+insert 快捷键
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //get/set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void study(){
        System.out.println("学生正在学习");
    }
    public void eat(){
        System.out.println("学生正在吃");
    }
    public void sleep(){
        System.out.println("学生正在睡觉");
    }
}
