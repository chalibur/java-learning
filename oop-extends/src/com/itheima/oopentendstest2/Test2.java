package com.itheima.oopentendstest2;

public class Test2 {
    public static void main(String[] args) {
        APPLE iphone16=new APPLE();
        iphone16.brand="APPLE";
        iphone16.price=8000;
        iphone16.Calling();
        iphone16.Messaging();
        System.out.println(iphone16.brand+iphone16.price);

        System.out.println("-------------------------------");

        Android a=new Android();
        a.brand="魅族";
        a.price=5999;
        a.Calling();
        a.Messaging();
        a.NFC();
        System.out.println(a.brand+a.price);

        System.out.println("-------------------------------");

        LapTop lapTop=new LapTop();
        lapTop.brand="Dell";
        lapTop.price=6999;
        lapTop.Coding();
        System.out.println(lapTop.brand+lapTop.price);
    }

}
