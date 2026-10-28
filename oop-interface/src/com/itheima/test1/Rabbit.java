package com.itheima.test1;

public class Rabbit extends Animal {

    public Rabbit() {
    }

    public Rabbit(String name, String colour) {
        super(name, colour);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");

    }

}
