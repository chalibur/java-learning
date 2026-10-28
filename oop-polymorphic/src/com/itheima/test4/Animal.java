package com.itheima.test4;

public abstract class Animal {
    private String name;//姓名
    private String colour;//颜色

    //构造函数

    public Animal() {
    }

    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //定义抽象方法
    public abstract void eat();
    public abstract void ability();
    //定义通用方法
    public void drink() {
        System.out.println("喝水");
    }
}
