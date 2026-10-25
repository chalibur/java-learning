package com.itheima.oppextendstest4;

public class Test4 {
    //1.定义一个手机
    public static void main(String[] args){
        Phone p=new Phone();
        p.name="xiaomi";
        p.price=6999;
        p.show();
        System.out.println(p.caculate());
        System.out.println("----------------------------------------");
        //2.定义一个笔记本电脑
        LapTop l=new LapTop();
        l.name="Dell";
        l.price=9999;
        l.show();
        System.out.println(l.caculate());
    }
}
