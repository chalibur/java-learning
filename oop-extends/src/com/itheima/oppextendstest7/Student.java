package com.itheima.oppextendstest7;

public class Student extends Person {

    //成员变量
    String grade;//年纪

    //构造方法
    public Student() {
        super();
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    //成员方法

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void study() {
        System.out.println("学生正在学习");
    }
}
