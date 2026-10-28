package com.itheima.test3;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //成员方法：使用图形，打印图形信息，并打印周长和面积
    public double usePattern(Circle circle) {
        System.out.println("使用圆形" + circle );
        System.out.println("圆形的面积是：" + circle.getArea() + ", 周长是：" + circle.getPerimeter());
        return circle.getArea() + circle.getPerimeter();

    }
    public double usePattern(Rectangle rectangle) {
        System.out.println("使用矩形" + rectangle );
        System.out.println("矩形的面积是：" + rectangle.getArea() + ", 周长是：" + rectangle.getPerimeter());
        return rectangle.getArea() + rectangle.getPerimeter();

    }
}
