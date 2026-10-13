package com.itheima.literl.controllerloop;

public class ContinueDemo2 {
    public static void main(String[] args) {
       //循环打印1-100的数字
        for (int i = 1; i <= 100; i++) {

        //找到符合要求的数字
            if(i/7==0||i%10==7||i%7==0){
                System.out.println('过');
                continue;}
            System.out.println(i);
        }

    }
}
