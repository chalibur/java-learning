package com.itheima.a03innerclassdemo3;

public class Test3 {
    public static void main(String[] args) {
    Outer.Inner o1=new Outer().new Inner();
    o1.show();
    }
}
