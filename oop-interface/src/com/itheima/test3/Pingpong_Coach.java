package com.itheima.test3;

public class Pingpong_Coach extends Coach implements English {
    public Pingpong_Coach() {
    }

    public Pingpong_Coach(String name, int age) {
        super(name, age);
    }
    //成员方法

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void English(Person person) {
        System.out.println(person.getName() + "说英语");
    }
}
