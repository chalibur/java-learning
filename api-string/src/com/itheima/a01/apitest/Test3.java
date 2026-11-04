package com.itheima.a01.apitest;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    //需求：定义一个任意的字符串，打乱里面的内容
    public static void main(String[] args){
        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        char[] arr=str.toCharArray();
        //混乱
        Random r=new Random();
        int randomIndex=r.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
             char tem=0;
            tem=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=tem;
        }


        //变回字符串
        String str2=new String(arr);
        System.out.println(str2);
    }

}
