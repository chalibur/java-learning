package com.itheima.literl.controllerloop;

import java.util.Scanner;

public class BreakDemo3 {
    /*
    需求：键盘录入一个大于等于2的整数，判断是否是质数
     */
    public static void main(String[] args) {
        //1.输入部分+判断是否大于二
        Scanner sc=new Scanner(System.in);
        int number=0;
        while (true) {
            System.out.println("please input a number:");
            number=sc.nextInt();
            if(number>=2)
                break;
            else{
                System.out.println("the number you input is less than 2, please input again");
            }
        }
        System.out.println("the number you input is:"+number);
        //2.判断是否是质数
        for(int i=2;i<=number-1;i++){
            if(number%i==0){
                System.out.println(number+" is not a prime number");
                break;}
            }System.out.println(number+" is a prime number");//是质数的判断只能写在循环外面
        //不是质数的循环只能写在循环里面，因为循环里面是一个判断的逻辑，不是的话才能break
        }

    //进阶：循环的范围可以更大程度的收缩，比如：for(int i=2;i<=number/2;i++)
    //因为一个数字的因子一定是一个存在于小于平方根的，一个一定是大于平方根的，所以循环的范围可以更大程度的收缩

    }

