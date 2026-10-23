package com.itheima.finaltest2;

public class Circle {
    //属性
    private double radii;//半径
    private final double PI=3.1415926;
    //构造函数

    public Circle() {
    }

    public Circle(double radii) {
        this.radii = radii;
    }

    public double getRadii() {
        return radii;
    }

    public void setRadii(double radii) {
        this.radii = radii;
    }

    public double getPI() {
        return PI;
    }

    //计算圆的面积
    public double getArea()
    {
        return PI*radii*radii;
    }

    //计算圆的周长
    public double getPerimeter()
    {
        return 2*PI*radii;
    }
}
