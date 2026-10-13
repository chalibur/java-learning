package com.itheima.literl.ifDemo;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class IfDemo3 {
    /*if（关系表达式）{
    语句A；
    }else{
    语句B；
    }
    */
    //需求：定义一个小数定义考试成绩；
   //判断学生的成绩，如果大于等于60则通过，否则不通过
   /*public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入你的成绩：" );
       double score=sc.nextDouble();
       if(score>=60){
           System.out.println("通过");
       }else{
           System.out.println("不通过");
       }
   }
}
*/
//需求：小明每次订外卖的时候都会在多家平台对比，看看谁的优惠力度更大
//已知：饿了么app：全场九折优惠
//     美团app：满三十减十元；
//请问：1.小明买了一个烧烤50元，在哪家下单更划算？
//请问：2.如果价格不确定，数据由键盘录入
    public static void main(String[] args) {
//        int price=50;
//        double price1=price*0.9;
//        int price2=price-10;
//        if(price1<price2){
//            System.out.println("在饿了么app下单更划算,价格为"+price1);
//        }else{
//            System.out.println("在美团app下单更划算，价格为"+price2);
//        }
        Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();
        System.out.println("请输入价格:");
        double price1=price*0.9;
        int part=(int)(price/30);
        int price2=(int)(price-10*part);
        if(price1<price2){
            System.out.println("在饿了么app下单更划算,价格为"+price1);
        }else{
            System.out.println("在美团app下单更划算，价格为"+price2);
        }



    }

    }