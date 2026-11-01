package com.itheima.a06innerclassdemo6;

public class Test {
    /*
    匿名内部类：创建了一个接口的实现对象，只不过这个对象没有名字

    一个匿名内部类同时完成了实现接口和创建对象的过程
     */


    public static void main(String[] args){
        goSwimming(new Swim(){
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        });

    }

    public static void goSwimming(Swim s) {
        s.swim();
    }

}
