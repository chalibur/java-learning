package com.itheima.test3;

public class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    //成员方法
    public void teach(){
        System.out.println("教怎么打球");
    }

}
