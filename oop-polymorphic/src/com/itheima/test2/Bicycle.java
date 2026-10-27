package com.itheima.test2;

public class Bicycle extends Vehicle{
    public Bicycle() {
    }

    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }
    public void ringbell() {
        System.out.println("铃铃铃");
    }

    @Override
    public void move() {
        System.out.println(getBrand()+"的自行车正在以"+getSpeed()+"的速度移动");
    }
}
