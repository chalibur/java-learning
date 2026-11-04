package com.itheima.a01.apidemo4;

import java.util.Scanner;

public class Test1 {
    /*
    数据脱敏：
    String substring(int beginIndex, int endIndex)：返回一个新的字符串，它是此字符串的子字符串。此字符串从指定的beginIndex开始，直到索引endIndex - 1处的字符结束。
    注意：包头不包尾，包左不包右
     */
    /*
    需求：指向表达用户的第一个字符，后面的都用*表示
     */
    public static void main(String[] args){
        String str="12345";
        System.out.println(str.substring(1,3));
        System.out.println(str.substring(1));
        //定义一个字符串，用于存储用户输入的字符串
        String userName="zhangsan";

        //获得一个用户的字符串
        System.out.println("请输入一个字符串：");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.print(input.substring(0,1));
        System.out.print("*".repeat(input.length()-1));
    }


}
