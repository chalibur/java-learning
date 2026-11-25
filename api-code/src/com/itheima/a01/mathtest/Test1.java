package com.itheima.a01.mathtest;

import java.util.Scanner;

public class Test1 {
    /*
    定义一个方法，判断一个数是不是质数

     */
    public static void main(String[] args){
        System.out.println("请输入一个数字：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPrime(num)) {
            System.out.println("是质数");
        }
        else {
            System.out.println("不是质数");
        }
    }
    public static boolean isPrime(int num){
    int sqrt= (int)Math.pow(num,0.5);
        for (int i = 2; i <= sqrt; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

}
