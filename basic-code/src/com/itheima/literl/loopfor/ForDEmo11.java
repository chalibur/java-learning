package com.itheima.literl.loopfor;

import java.util.Scanner;

public class ForDEmo11 {
    /*
    描述：
    给定一个整数n，请计算其所有位数之和，若n为负数，先取其绝对值
    实例：
    输入：12
    说明1+2=3
    输出3
    示例2
    输入：-305
    说明3+0+5=8
    输出8
     */
    public static void main(String[] args){
        System.out.println("请输入一个整数：");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number<0){
            number=-number;
        }
        System.out.println("number is "+number);
        //把每一位拿出来
        //利用循环获取每一位
        int sum=0;
        while(number>0){
            int dight=number%10;
            System.out.println(dight);
            sum=sum+dight;
            number=number/10;
        }
        System.out.println("sum is:"+sum);
    }
}
