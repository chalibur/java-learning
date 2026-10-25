package com.itheima.oppextendstest5;

public class Student extends Person {

    String grade;//年纪

    public Student() {
        super();
    }
//全参构造（父类+子类）
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    public void study() {
        System.out.println("学生正在学习");
    }
}
