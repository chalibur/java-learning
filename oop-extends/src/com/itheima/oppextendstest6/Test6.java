package com.itheima.oppextendstest6;

public class Test6 {

public static void main(String[] args){

    Student s=new Student("张三", 18);
    System.out.println(s.name+" "+s.age);
    Student s2=new Student();
    System.out.println(s2.name+" "+s2.age);
}
}
