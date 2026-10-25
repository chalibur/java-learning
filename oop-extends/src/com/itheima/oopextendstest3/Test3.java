package com.itheima.oopextendstest3;

public class Test3 {
    public static void main(String[] args) {
        //1.创建一个第一代手机变量
        FirstGenerationPhone p1 = new FirstGenerationPhone();
        p1.Call();
        System.out.println("----------------------");
        //2.创建一个第二代手机变量
        SecondGenerationPhone p2 = new SecondGenerationPhone();
        p2.Call();
        p2.sendMessage();
        System.out.println("--------------------------");
        //3.创建一个第三代手机变量

        ThirdGenerationPhone p3 = new ThirdGenerationPhone();
        p3.Call();
        p3.playGame();
        p3.sendMessage();
    }
}
