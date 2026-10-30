package com.itheima.test3;

public class Pingpong_Athletes extends Athletes implements English {

    public Pingpong_Athletes() {
    }

    public Pingpong_Athletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void English(Person person) {
        System.out.println(person.getName() + "说英语");
    }
}
