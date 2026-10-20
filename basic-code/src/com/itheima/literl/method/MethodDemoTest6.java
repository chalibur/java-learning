package com.itheima.literl.method;

import java.util.Scanner;

public class MethodDemoTest6 {
    /*计算快递邮费
    某快递公司的运费规则如下（首重1kg，超出部分按kg算，不足1kg按1kg算）：
    首重1kg：10元
    超出1-5kg：每kg加2元
    超出5kg以上：每kg1.5元
    键盘录入小数，表示用户快递的重量，计算最终的结果
    要求1：快递重量必须大于0，否则重新输入
    要求2：不同价位的计算，单独定义一个方法

     */
    public static double calculateMailFee1(double weight){
    if(weight<=6)
        return 10+2*(weight-1);
    else
        return 10+2*5+1.5*(weight-5);
    }
    public static void main(String[] args){
        //要求快递的重量必须大于0
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入快递的重量：");
        double weight=sc.nextDouble();
        if(weight<=0){
            System.out.println("快递重量不能小于等于0，请重新输入");
            weight=sc.nextDouble();
        }

    double fee=calculateMailFee1(weight);
        System.out.println("快递的邮费是："+fee);
    }
}


