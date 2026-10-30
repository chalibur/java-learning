package com.itheima.a04innerclassdemo4;

public class Test {
    public  static void main(String[] args){
        /*
        只要是静态的东西，都可以直接通过类名进行调用

         */
        Outer.Inner o1=new Outer. Inner();

        //跟成员内部类有区别
        o1.show1();
        o1.show2();
        //不提倡
        Outer.Inner.show2();

    }
}
