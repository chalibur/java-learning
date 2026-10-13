package com.itheima.literl.operator;

import java.util.Scanner;

public class operatoroDemo10 {
    /*
    逻辑运算符：
    && 与
    || 或
    !  非
     */
    //1.录入一个数字判断是否在1-10之间
    //2.录入一个整数判断是否不在1-10之间
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean result =number<1||number>10;
        System.out.println("result="+result);

    }

}
