package com.itheima.test3;

public class Basketball_Athletes extends Athletes{
    public Basketball_Athletes() {
    }

    public Basketball_Athletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}
