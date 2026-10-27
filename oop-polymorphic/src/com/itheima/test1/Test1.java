package com.itheima.test1;

public class Test1 {
    /*
    学生类：
    属性：姓名，账号，密码
    行为：work：学生的工作是学习
    老师类：
    属性:行为，账号，密码
    行为：work：老师的工作是教学
    管理员：
    属性：姓名，账号，密码
    行为：work：管理员的工作是管理

    学生管理系统：
    行为：注册register
    要求：能注册所有的角色
    输出：行为没张三的同学注册成功，账号为zhangsan，密码123456
     */
    public static void main(String[] args){

        //1.创建一个学生的对象
        Student stu=new Student("张三","zhangsan","123456");
        //2.创建学生管理系统的对象
        StudentManger sm=new StudentManger();
        sm.register(stu);
        System.out.println("------------------------------");
        //3.创建一个老师的对象
        Teacher t=new Teacher("lisi","lisi","123456");
        sm.register(t);
    }
}
