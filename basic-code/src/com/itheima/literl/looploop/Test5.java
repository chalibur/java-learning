package com.itheima.literl.looploop;
/*
打印九九乘法表
 */
public class Test5 {
    public static void main(String[] args){
        //先打印一个直角三角形
        //外循环行数
        for(int i=1;i<=9;i++){
            //内循环：列数
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");

            }
            System.out.println("");
        }
    }
}
