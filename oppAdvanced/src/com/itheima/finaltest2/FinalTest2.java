package com.itheima.finaltest2;

public class FinalTest2 {
    public static void main(String [] args){


        Circle c=new Circle(1.5);
        System.out.println(c.getRadii());
        System.out.println(c.getPI());
        //获取圆的面积和周长

        System.out.println("c'area is:"+c.getArea());
        System.out.println("c'perimeter is:"+c.getPerimeter());
    }
}
