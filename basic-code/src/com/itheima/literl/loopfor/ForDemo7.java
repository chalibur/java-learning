package com.itheima.literl.loopfor;

import java.util.Scanner;

public class ForDemo7 {
    /*
    需求：
    想计算前n项的和：
    Sn=1-2+3-4.....
    示例：
    输入：4
    说明：Sn=1-2+3-4=-2
    输出：-2
     */
    public static void main(String[] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number=sc.nextInt();

        for(int i=1;i<=number;i++){
            if(i%2==0){
                sum=sum-i;
            }
            else {
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
}
