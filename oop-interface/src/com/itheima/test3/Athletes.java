package com.itheima.test3;

public class Athletes extends Person{
    //构造函数

    public Athletes() {
    }

    public Athletes(String name, int age) {
        super(name, age);
    }
    //成员方法

    public void study(){
        System.out.println("学习打球");
    }

}
