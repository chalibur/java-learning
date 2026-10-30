package com.itheima.a04innerclassdemo4;

public class Outer {
    int a=10;
    static int b=20;
    static class Inner{
        public void show1(){
            System.out.println("非静态方法被调用了");
            Outer outer=new Outer();
            System.out.println(outer.a);
            System.out.println(b);
        }
        public static void show2()  {
            System.out.println("静态方法被调用了");
            Outer outer=new Outer();
            System.out.println(outer.a);
            System.out.println(b);
        }
    }
}
