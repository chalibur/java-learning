package com.itheima.a01.apidemo3;

import java.util.Scanner;

public class Test4 {
    /*
    键盘录入一个字符串，统计该字符串中大写字符、小写字符、数字字符的个数，并输出结果。
     */
    public static void main(String[] args){
        System.out.println("请输入一个字符串：");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //定义count
        int countLower=0;
        int countUpper=0;
        int countDigit=0;
        //统计次数，先遍历
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if('a'<=c&&c<='z'){
                countLower++;
            } else if ('A'<=c&&c<='Z') {
                countUpper++;
            } else if ('0'<=c&&c<='9') {
                countDigit++;
            }
        }
        System.out.println("大写字符的个数是："+countUpper);
        System.out.println("小写字符的个数是："+countLower);
        System.out.println("数字字符的个数是："+countDigit);
    }
}
