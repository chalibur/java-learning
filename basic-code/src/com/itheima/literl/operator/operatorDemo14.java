package com.itheima.literl.operator;

public class operatorDemo14 {
    /*
    三元运算符：
    格式：条件？表达式1：表达式2
    如果条件为true，则返回表达式1，否则返回表达式2
     */
    public static void main(String[] args) {
        //利用三元运算符，求两个整数的最大值
        int a=10;
        int b=20;
        int result =a>b?a:b;
        System.out.println("max is "+result);

    }
}
