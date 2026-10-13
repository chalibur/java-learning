package com.itheima.literl.looploop;

public class Test2 {
    /*
    打印正三角形，
     */
    public static void main(String[] args) {
        //line1
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}