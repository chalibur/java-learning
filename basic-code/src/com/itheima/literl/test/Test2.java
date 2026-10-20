package com.itheima.literl.test;

import java.util.Random;

public class Test2 {
    /*
    红包问题：
    给你两个整数M和N，M表示红包的总额，N表示红包的个数
    现在又来N个人来抽红包，每个人都是随机的，打印每个人领取的红包金额

    注：
    1.每个人至少0.1元
    2.每个人领完之后至少要留1*N分钱
    3.最后一个人拿剩余的总额
     */
    public static void main(String[] args){
        //定义红包的总额(单位：分)
        int money=5;
        //定义红包的个数
        int n=5;

        //判断红包的金额要足够
        if (money<n) {
            System.out.println("红包金额不够");
            return;
        }
        Random r= new Random();
        for (int i=1; i < n; i++) {
            int mymoney= r.nextInt( money-(n-1))+1;
            System.out.println("第"+i+"个人领取的红包金额是："+mymoney+"分");
        }
        //money-(n-1)是为了给后面的人预留足够的钱

    }
}
