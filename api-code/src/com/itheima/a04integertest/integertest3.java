package com.itheima.a04integertest;

public class integertest3 {
    /*
    自动装箱和自动拆箱：
    什么是包装类？
    基本数据类型所对应的引用数据类型
    例如：
    int -> Integer
    double -> Double
    boolean -> Boolean
    char -> Character
    byte -> Byte
    short -> Short
    long -> Long
     */
    public static void main(String[] args){
        Integer i1=100;
        Integer i2=200;
        //对象和对象是不能相加的，但是涉及到自动装箱和自动拆箱
        /*
        JVM会自动将i1和i2转换成int类型，然后进行相加，最后将结果转换成Integer对象
        调用的就是Integer的valueOf方法和intValue方法
         */
        Integer i3=i1+i2;
        System.out.println(i3);
    }
}
