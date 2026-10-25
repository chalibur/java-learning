package com.itheima.oppextendstest5;

public class Person {
    String name;//姓名
    int age;//年龄

    //构造函数

    public Person() {
        System.out.println("父类的空参构造执行了");
    }

    public Person(String name, int age) {
        System.out.println("父类的有参构造执行了");
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("姓名：" + name + ", 年龄：" + age);
    }
}
