package com.itheima.literl.loopfor;

public class ForDemo9 {
    /*
    复利计算器：
    假设你在银行中投资了1000000元，银行给出的复利是1.7%，问多少年后能够实现本金翻倍，请问：
    用什么循环？代码是如何实现的

     */
    public static void main(String[] args){
        double money=1000000;
        //定义期望的本金
        double expectmoney=2000000;

        //定义年数
        int year=0;
        while (money<expectmoney){
            money=money*1.017;
            year++;
        }
        System.out.println("需要的年数为"+year);
    }

}
