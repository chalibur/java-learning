package com.itheima.test3;

public class Basketball_Coach extends Coach{
    public Basketball_Coach() {
    }

    public Basketball_Coach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
