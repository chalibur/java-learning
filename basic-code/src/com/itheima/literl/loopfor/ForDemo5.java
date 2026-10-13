package com.itheima.literl.loopfor;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class ForDemo5 {
    /*
    统计满足条件的数字：
键盘录入两个数字，表示一个范围
统计这个范围中，既能被3整除，又能被5整除的数字有几个
     */
    public static void main(String[] arges){
        Scanner sc=new Scanner(System .in);
        System.out.println("请输入第一个数字");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字");
        int b=sc.nextInt();
        int max=a>b? a:b;
        int min=a<b? a:b;
        int count=0;
        for(int i=min;i<=max;i++){
            if(i%3==0&&i%5==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("一共有"+count+"个符合要求的数");

    }
}
