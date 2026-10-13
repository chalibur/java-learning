package com.itheima.literl.verableDemo;

import java.util.Scanner;

public class veriableDemo8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //BMI=体重/身高*身高
    System.out.println("请输入你的体重：");
    double weight =sc.nextDouble();
    System.out.println("请输入你的身高：");
    double height = sc.nextDouble();
    double bmi = weight / (height * height);
    System.out.println("你的BMI指数为：" + bmi);
    }
}
/*
1.运算符：
    1.算术运算符：+ - * / % ++ --
    2.关系运算符：> < >= <= == !=
    3.逻辑运算符：&& || !
    4.赋值运算符：= += -= *= /= %= &= |= ^= >>= <<=

 */