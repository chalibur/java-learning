package com.itheima.a03objecttest;

public class objectTest {
    public static void main(String [] args){
        /*
        Object是顶级父类，所有的类都直接或者剪辑的继承于Object类
        toString()：返回对象的字符串表示
        equals()：比较两个对象是否相等
         */
        Student s=new Student("张三",18);
        System.out.println(s.toString());//是对象的内存地址
        //System是java中已经写好的一个类
        //out应该是System里面的静态变量，直接用类名调用
        //程序运行之后会对控制台的对象进行赋值，打印在控制台
        //这个时候就不用直接调用toSTring方法了
        /*
        所以一般情况下都会重写toString方法
         */

        System.out.println(s);
    }
}
