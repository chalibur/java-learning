package com.itheima.a01.apitest;

import java.util.Scanner;

public class Test1 {
    /*
    需求：当键盘录入字符串，将该字符串进行反转，当输入拜拜的时候该程序停止运行
    例如：键盘录入abc，输出结果cba
     */
    public static void main(String[] args){
        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        while (!str.equals("拜拜")){
            //字符串反转
            StringBuilder reverse=new StringBuilder();
            reverse.append(str).reverse();
            System.out.println("反转后的字符串是："+reverse);
            System.out.println("请输入一个字符串：");
            str=sc.next();
        }


    }
}
