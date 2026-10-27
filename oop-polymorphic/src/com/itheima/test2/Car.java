package com.itheima.test2;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + "的汽车正在以" + getSpeed() + "的速度移动");
    }
    public void honk() {
        System.out.println("汽车正在鸣笛");
    }
}
