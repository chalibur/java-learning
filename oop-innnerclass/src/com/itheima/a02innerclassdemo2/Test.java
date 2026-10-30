package com.itheima.a02innerclassdemo2;

public class Test {
    /*

    之前调用对象的方式：
    Student s= new Student();
    内部类对象创建方式：
    Outer.Inner o1=new Outer().new Inner();

    当成员内部类被private修饰了
    1.可以在外部类中创建一个方法，返回内部类对象
    public Inner getInner(){
        return new Inner();
    }
    2.不要修饰内部类为private，直接调用
     */
    public static void main(String[] args) {

    }
}
