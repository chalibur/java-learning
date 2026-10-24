package com.itheima.oopextendstest1;

public class Student extends Person {
    //extends关键字表示继承，表示Student类继承自Person类
    //Student类新增一个成员变量grade

    String grade;
    //新增一个成员方法Study，表示学生正在学习
    public void Study(){
        System.out.println("正在学习！");
    }

}
