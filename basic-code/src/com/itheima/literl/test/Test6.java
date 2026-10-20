package com.itheima.literl.test;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
/*
彩票规则：
前区：5个不重复的号码，从1-35中选择
后区：2个不重复的号码，从1-12中选择
跨区可以重复

中奖规则：
一等奖：5+2
二等奖：5+1
三等奖：5+0/4+2
四等奖：4+1/3+2
五等奖：4+0/3+1/2+2
六等奖：3+0/1+2/2+1/0+2
 */
//前区随机数生成

    public static int[] createlotteyNumber(){
        //1.创建数组
        int[] arr = new int[5];
        //2.生成随机数
        Random r=new Random();
        for (int i = 0; i < arr.length; ) {
            int num=r.nextInt(1,36);

            if(!contains(num, arr)){
                arr[i]=num;
            i++;}
        }
        return arr;
    }
    //后区随机数生成
    public static int[] createlotteyBehindNumber(){
        //1.创建数组
        int[] arr = new int[2];
        //2.生成随机数
        Random r=new Random();
        for (int i = 0; i < arr.length; ) {
            int num=r.nextInt(1,13);

            if(!contains(num, arr)){
                arr[i]=num;
            i++;}
        }
        return arr;
    }

    public static boolean contains(int num, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){

        int[] arr1 = createlotteyNumber();
        System.out.println("前区：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("");
        System.out.println("后区：");
        int[] arr2 = createlotteyBehindNumber();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        //合并前区和后区
        int []arr=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[i+arr1.length]=arr2[i];
        }
        System.out.println("");
        System.out.println("合并之后的数组是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        //利用Scanner来模拟购买彩票
        Scanner sc=new Scanner(System.in);
        int []buy1=new int[5];
        for (int i = 0; i < 5; ) {
            System.out.println("请输入第"+(i+1)+"个前区号码：");
            int num= sc.nextInt();
            if(!contains(num, buy1)){
                buy1[i]=num;
                i++;
            }else{
                System.out.println("输入的号码重复，请重新输入");
            }

        }
        int []buy2=new int[2];
        for (int i = 0; i < 2; ) {
            System.out.println("请输入第"+(i+1)+"个后区号码：");
            int num= sc.nextInt();
            if(!contains(num, buy2)){
                buy2[i]=num;
                i++;
            }else{
                System.out.println("输入的号码重复，请重新输入");
            }
        }
        //判断是否中奖，判断前区
        int count1=0;
        for (int i = 0; i < buy1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(buy1[i]==arr1[j])
                    count1++;
            }
        }
        //判断后区
        int count2=0;
        for (int i = 0; i < buy2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(buy2[i]==arr2[j])
                    count2++;
            }
        }
        System.out.println("中奖情况：");
        if(count1==5&&count2==2)
            System.out.println("一等奖");
        else if(count1==5&&count2==1)
            System.out.println("二等奖");
        else if(count1==5&&count2==0)
            System.out.println("三等奖");
        else if(count1==4&&count2==1)
            System.out.println("四等奖");
        else if(count1==4&&count2==0)
            System.out.println("五等奖");
        else if(count1==3&&count2==0)
            System.out.println("六等奖");
        else
            System.out.println("没有中奖");
    }
}
