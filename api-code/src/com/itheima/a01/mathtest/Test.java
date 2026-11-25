package com.itheima.a01.mathtest;

import java.util.Scanner;

public class Test {
    /*
    自幂数：
    一个n位自然数等于自身各个数位上数字的n次幂之和

     */
    public static void main(String[] args){
        System.out.println("请输入一个数字：");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int num=input;
        String str="";
        //先拿到num的每一位
        while(num!=0){
            int dight=num%10;
            System.out.println(dight);
            str+=dight;
            num=num/10;
        }
        StringBuilder sb=new StringBuilder(str);
        System.out.println("您输入的数字是："+sb.reverse());
        //开始累加
        int sum=0;
        for (int i = 0; i < sb.length(); i++) {
            sum+=Math.pow(sb.charAt(i)-'0',sb.length());
        }
        System.out.println("sum="+sum);
        //最后进行判断
        if(input==sum){
            System.out.println("是自幂数");
        }else{
            System.out.println("不是自幂数");
        }
    }
}
