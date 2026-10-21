package com.itheima.opptest7;

public class Student {
    //属性
private String name;
private int age;
private String gender;
private int height;
//构造函数（两个）
public Student(){
    System.out.println("空参构造方法被调用");
}
public Student(String name, int age, String gender, int height)
{
    System.out.println("带参构造方法被调用");

    this.name=name;
    this.age=age;
    this.gender=gender;
    this.height=height;
}
//类内方法
    public void setname(String name){this .name=name;}
    public String getname(){return this.name;}
    public void setage(int age){this.age=age;}
    public int getage(){return this.age;}
    public void setgender(String gender){this.gender=gender;}
    public String getgender(){return this.gender;}
    public void setheight(int height){this.height=height;}
    public int getheight(){return height;}




}

