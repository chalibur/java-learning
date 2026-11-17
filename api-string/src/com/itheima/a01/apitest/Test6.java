package com.itheima.a01.apitest;

import java.util.Scanner;

public class Test6 {
    /*
写出一个程序，接受一个由字母，空格，和数组组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数（不区分大小写）
数据范围：
1<=n<=1000
输入描述：
第一行输入一个由字母，数字，空格组成的字符串
第二行输入一个一个字符，确保该字符不是空格

输出描述：
输出输入字符串时含有该字符的个数，不区分大小写
     */
    public static void main(String[] args){
        //1.输入操作
        System.out.println("请输入一个字符串：");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("请输入一个字符：");
        char ch=sc.next().charAt(0);

        //2.统计字符出现次数
        int count=0;
        char target=Character.toLowerCase(ch);

        for (int i = 0; i < str.length(); i++) {
            if(Character.toLowerCase(str.charAt(i))==target){
                count++;
            }
        }
        System.out.println("字符"+ch+"出现的次数为："+count);
    }
}
