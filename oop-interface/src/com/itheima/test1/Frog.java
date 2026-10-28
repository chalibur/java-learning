package com.itheima.test1;

public class Frog extends Animal implements Swim {

    public Frog() {
    }

    public Frog(String name, String colour) {
        super(name, colour);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }
}
