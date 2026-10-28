package com.itheima.test3;

public class Test3 {
    /*
    1.定义长方形类
    属性：宽，高
    行为：计算周长，计算面积

    2.定义圆形类
    属性：圆周率，半径
    行为：计算周长，计算面积

    3.定义学生类
    属性：姓名，年龄
    行为：使用图形，打印图形信息，并打印周长和面积

    要求：学生使用图形的方法，既能使用长方形，又能使用圆形
     */
    public static void main(String[] args){
        //1.定义一个长方形
        Rectangle rectangle=new Rectangle(10,20);
        System.out.println("长方形的面积是："+rectangle.getArea()+",周长是："+rectangle.getPerimeter());

        //2.定义一个圆形
        Circle circle=new Circle(4.14,5);
        System.out.println("圆形的面积是："+circle.getArea()+",周长是："+circle.getPerimeter());

        //3.定义一个学生
        Student student=new Student("张三",18);
        student.usePattern(circle);
        student.usePattern(rectangle);
    }


}
