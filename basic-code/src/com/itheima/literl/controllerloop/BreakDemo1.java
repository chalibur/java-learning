package com.itheima.literl.controllerloop;

public class BreakDemo1 {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++) {
            if(i==15){
                System.out.println(i);
                break;
//看到break，本次循环的所有语句都不会继续执行，直接跳出
            }
        }
    }


}
