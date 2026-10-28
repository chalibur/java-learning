package com.itheima.test4;

public  class Dog extends Animal{
    //构造函数

    public Dog() {
    }

    public Dog(String name, String colour) {
        super(name, colour);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");

    }

    @Override
    public void ability() {
        System.out.println("狗看家");
    }
}
