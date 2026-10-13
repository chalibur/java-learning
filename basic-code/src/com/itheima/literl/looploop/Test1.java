package com.itheima.literl.looploop;


import java.sql.SQLOutput;

public class Test1 {

    /*
    打印四行五列的*
     */
    //System.out.println先打印，在换行
    //System.out.print只打印不换行，不会另起一行

    public static void main(String[] args) {

        for (int j = 0; j < 4; j++){

            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println("");
    }
}
    }
