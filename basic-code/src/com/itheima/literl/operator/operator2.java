package com.itheima.literl.operator;

import java.util.Scanner;

public class operator2{
    public static void main(String[] args) {
        //需求：键盘录入一个三位数，输出他的个位，十位，百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number=sc.nextInt();
        int bai=number/100;
        int shi=(number%100)/10;
        int ge=number%10;
        System.out.println("个位是："+ge+"，十位是："+shi+"，百位是："+bai);


}
}
