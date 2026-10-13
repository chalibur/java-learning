package com.itheima.literl.operator;

import java.util.Scanner;

public class operatorDemo9 {
    // 2.键盘录入一个三位数，判断是否可以被3整除
    public static void main(String[] args) {
        System.out.println("请输入一个三位数：");
        Scanner sc=new Scanner (System.in);
        int number=sc.nextInt();
        //拆分
        int bai=number/100;
        int shi=number%100/10;
        int ge=number%10;

        //验证是否可以被三整除
        int sum =bai+shi+ge;
        boolean result=sum%3==0;
        System.out.println("result="+result);

    }
}
