
package com.itheima.literl.method;

import java.util.Scanner;

public class MethodDemoTest5 {
    /*
    方法的小诀窍：
    1.方法的调用处，手续要这个独立功能的结果继续去做其他事情？
    2.这个独立功能需要什么才能完成？
    3.观察在大段的代码当中，反复使用的功能是什么？

    题目要求：跳水比赛有五个评委打分，分数在0-100之间，最终得分会去掉一个最高分，去掉一个最低分
    剩余的分数在求平均数，该平均数为该选谁的最终得分
    要求1.利用键盘录入五个整数存在数组当中，如果分数超出范围需要重新录入
    要求2.定义方法分别求数组的最大值和最小值
    要求3.计算五名评委的总分
    要求4.总分-最大值-最小值，求选手最终平均分
     */
    //定义方法分别求数组的最大值和最小值
    public static int getmax(int arr[]) {
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
        public static int getmin(int arr[]){
            int min=arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<min)
                    min=arr[i];
            }
            return min;
    }

    public static void main(String[] args){
    //键盘录入五个整数，如果分数超出范围需要重新录入
        Scanner sc=new Scanner(System.in);
        int score[]=new int [5];
        for (int i = 0; i < score.length;i++ ) {
            System.out.println("请输入第"+(i+1)+"个评委的打分：");
            int num=sc.nextInt();
            while(num<0||num>100) {
                System.out.println("输入的分数超出范围，请重新输入：");
                num=sc.nextInt();

            }
            score[i]=num;

        }
        //遍历一遍
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        //找出评分中的最大值和最小值
        int max=getmax(score);
        int min=getmin(score);
        System.out.println("最大值是："+max+"，最小值是："+min);
        //计算五位评委的总分
        int sumscore = 0;
        for (int i = 0; i < score.length; i++) {
            sumscore+=score[i];
        }
        System.out.println("五位评委的总分是"+sumscore);
        System.out.println("最终选手的得分是："+(sumscore-max-min)/3.0);
        }
    }

