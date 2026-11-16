package com.itheima.a01.apitest;

import java.util.Scanner;

public class Test7 {
    /*
    给你一个字符串s，由若干单词组成，单词前后用一些空格字符隔开，返回字符串中最后一个单词的长度
    单词是指仅由字母组成，不含空白字符的最大字符串

    示例1；
    s="hello world"
    输出：最后一个单词是world，长度是5

    示例2；
    s="   fly me   to   the moon  "
    输出：最后一个单词是moon，长度是4
     */
    public static void main(String[] args){
        //1.输入一个字符串
        System.out.println("请输入一个字符串：");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder result=new StringBuilder();
        //2.确定最后一个单词的结束的字符
        int last=str.length()-1;
        while(str.charAt(last)==' '){
            last--;
        }


        int end=last;
        while(str.charAt(end)!=' ') {
            result.append(str.charAt(end));
            end--;
        }
        result.reverse();

        System.out.println("最后一个单词是："+result+"，长度是："+result.length());

    }
}
