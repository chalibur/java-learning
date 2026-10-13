package com.itheima.literl.verableDemo;

import java.util.Scanner;

public class variableDemo6 {
    public static void main(String[] args) {
         /*
        键盘录入:
        1.找到scanner
        2.让scanner干活
         */
    //1.找到scanner
        Scanner sc=new Scanner(System.in);  //1.找到scanner
    //2.让scanner干活
        //接收键盘录入的整数
        int num=sc.nextInt();
        System.out.println(num);
        //接收键盘录入的小数
        double num2=sc.nextDouble();
        System.out.println(num2);
        //接收键盘录入的文本（字符串）
        String ch=sc.next();
        System.out.println(ch);

    }
}
