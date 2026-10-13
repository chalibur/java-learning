package com.itheima.literl.operator;

import java.util.Scanner;

public class operatorDemo7 {
    //字符串只能进行+操作没有任何其他操作
    //任何数据+字符串都是拼接操作，并且产生一个新的字符串
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("请输入一个三位数：");
         int number=sc.nextInt();
         int bai=number/100;
         int shi=number%100/10;
         int ge=number%10;
         System.out.println("个位是"+ge+"，百位是"+bai+"，十位是"+shi);


     }

}
