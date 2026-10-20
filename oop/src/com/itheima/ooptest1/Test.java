package com.itheima.ooptest1;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Dog d1=new Dog();
        d1.name="旺财";
        d1.age=5;
        d1.colour="棕色";
        d1.weight=10.5;

        //获取第一个对象的信息
        System.out.println(d1.name);
        System.out.println(d1.age);

        //创建第二个对象
        Dog d2=new Dog();
        d2.name="小黑";
        d2.age=18;
        d2.colour="黑色";
        d2.weight=20.5;

        //获取第二个小狗的信息
        System.out.println(d2.name);
        System.out.println(d2.colour);
    }
}
