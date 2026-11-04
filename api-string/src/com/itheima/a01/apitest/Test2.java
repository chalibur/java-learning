package com.itheima.a01.apitest;

import java.util.Scanner;

public class Test2 {
    /*
    需求：键盘录入任意的字符串，请按长度为8拆分每个输入字符串并进行输出，
    长度不为8整数倍的字符串请在后面补0，空字符串不进行处理

    示例：
    输入：abcdabcda
    输出：
        第一行：abcdabcd
        第二行：a0000000
     */
    public static void main(String[] args){
        //1.键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        //2.空字符串不进行处理
        if(str.isEmpty()){
            System.out.println("输入为空字符串，请重新输入:");
            System.out.println("请输入一个字符串：");
            str=sc.next();
        }
        //遍历字符串每8个打印一行
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if((i+1)%8==0){
                System.out.println("");
            }

        }
        //补零，计算最后一行有多少个空格
        int lastlineCount=0;
        lastlineCount=8-str.length()%8;
        for (int i = 0; i < lastlineCount; i++) {
            System.out.print("0");
        }
    }
}
