package com.itheima.literl.method;

import java.awt.*;

public class MethodDemo4 {
    /*
    定义一个方法来打印九九乘法表
     */
    public static void printMultTable(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+" ");

            } System.out.println("");
        }
    }
    public static void main(String[] args){printMultTable();}

}
