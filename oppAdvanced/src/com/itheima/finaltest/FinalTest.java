package com.itheima.finaltest;

public class FinalTest {
    public static void main(String [] args){
        //定义一个final变量
        final int NUMBER=100;
        System.out.println(NUMBER);
        final Student stu=new Student("zhangsan",19);
        //final修饰的对象的内存地址是不会发生变化的
        //但是对象的属性是可以改变的
        stu.setName("lisi");
    }
}
