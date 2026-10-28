package com.itheima.test1;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, String colour) {
        super(name, colour);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗在游泳");

    }
}
