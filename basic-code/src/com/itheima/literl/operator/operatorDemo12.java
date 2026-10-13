package com.itheima.literl.operator;

import java.util.Scanner;

public class operatorDemo12 {

    /*
    键盘录入一个回文数，判断这个数字是不是回文数
     */

    public static void main(String[] args) {
     //1.键盘输入一个回文数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个4位数字");
        int number=sc.nextInt();
        System.out.println("输入的数字是"+number);
        //判断number是否是回文数
        //其关键在于是否符合对称性
        int qian=number/1000;
        int bai=number%1000/100;
        int shi=number%1000%100/10;
        int ge=number%10;
        boolean result =qian==ge&&bai==shi;
        System.out.println("reslut is:"+result);



    }

}
