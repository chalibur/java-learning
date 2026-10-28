package com.itheima.test4;

public  class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String colour) {
        super(name, colour);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void ability() {
        System.out.println("猫捉老鼠");
    }
}
