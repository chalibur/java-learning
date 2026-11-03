package com.itheima.a01.apidemo3;

import java.util.Scanner;

public class Test2 {
    /*
    需求：键盘录入一个字符串，利用程序实现在控制台遍历字符
public char charAt(int index)根据索引返回字符
public char length()返回字符串的长度
     */
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入一个字符串：");
    String str=sc.next();
    System.out.println("你输入的字符串是："+str);
    System.out.println("字符串的长度是："+str.length());
    //字符串的循环快捷方式：str.length().fori
     int length=str.length();
    for (int i = 0; i < length; i++) {
        System.out.print(str.charAt(i)+" ");
    }
}
}
