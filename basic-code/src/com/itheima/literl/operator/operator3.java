package com.itheima.literl.operator;

import java.util.Scanner;

public class operator3 {
    //给定秒数，将其转化成对应的小时数，分钟数和秒数，使得总时间不变，小时数，分钟数和秒数都不超过59
    public static void main(String[] args) {
        System.out.println("请输入秒数");
        Scanner sc=new Scanner(System.in);
        int seconds=sc.nextInt();

        int hours=seconds/3600;
        int minutes=(seconds-hours*3600)/60;
        int second=seconds-hours*3600-minutes*60;
        System.out.println(hours+"小时"+minutes+"分钟"+second+"秒");

    }
}
