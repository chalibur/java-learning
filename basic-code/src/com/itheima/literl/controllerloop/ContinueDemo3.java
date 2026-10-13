package com.itheima.literl.controllerloop;

import javax.swing.plaf.BorderUIResource;
import java.util.Random;
import java.util.Scanner;

public class ContinueDemo3 {
    public static void main(String[] args) {
    //生成随机数
        Random r=new Random();
        int num=r.nextInt(1,10);//如果括号内没有数字，则默认是在int的范围内生成好一个数字
        //第二种写法：小括号里面写一个数字，则表示随机数字的最大值，但是不包括这个数字

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个你要猜的数字");
            int guess = sc.nextInt();

            if (guess > num) {
                System.out.println("你猜的数字太大了");
            } else if (guess < num) {
                System.out.println("你猜的数字太小了");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }


    }
}
