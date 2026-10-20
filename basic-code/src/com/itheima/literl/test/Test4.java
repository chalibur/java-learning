package com.itheima.literl.test;

import java.util.Random;

public class Test4 {
    /*
    题目要求：
    学校选举学生会主席，有五个候选人，全校1000名学生参与投票
    （每人一票，可以弃权，或者选1-5号）
    投票使用random模拟。0：弃权，1-5：选1-5号
    要求一：
    统计每个候选人的得票数和得票率，找出得票数最多的候选人
    要求二：
    统计弃票数和弃票率分别多少？
     */
    //利用数组进行统计
    public static void main(String[] args) {
        Random r = new Random();
        int[] vote = {0, 0, 0, 0, 0, 0};

        for (int i = 1; i <= 1000; i++) {
            int num = r.nextInt(6);
            vote[num]++;
        }
        for (int i = 0; i < vote.length; i++) {
            System.out.print(vote[i]+" ");
        }
        System.out.println(" ");
        System.out.println("1号的得票数为："+vote[1]);
        System.out.println("1号的得票率为："+vote[1]/1000.0);
        System.out.println("2号的得票数为："+vote[2]);
        System.out.println("2号的得票率为："+vote[2]/1000.0);
        System.out.println("3号的得票数为："+vote[3]);
        System.out.println("3号的得票率为："+vote[3]/1000.0);
        System.out.println("4号的得票数为："+vote[4]);
        System.out.println("4号的得票率为："+vote[4]/1000.0);
        System.out.println("5号的得票数为："+vote[5]);
        System.out.println("5号的得票率为："+vote[5]/1000.0);
        System.out.println("弃权的票数为："+vote[0]);
        System.out.println("弃权的票率为："+vote[0]/1000.0);

        int max =vote[1];
        int num=1;
        for (int i = 1; i < vote.length; i++) {
            if(vote[i]>max){
                max=vote[i];
                 num=i;
            }
        }

        System.out.println("最多得票数为："+max+"，候选人编号为："+num);

    }
}
