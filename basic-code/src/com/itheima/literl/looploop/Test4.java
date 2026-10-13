package com.itheima.literl.looploop;

public class Test4 {
    /*
    打印平行四边形
     */
    public static void main(String[] args){
        //外循环：控制图形的行数
        //内循环：控制一行打印多少个#
        for(int i =1;i<=3;i++){
            for(int j=i;j<=2;j++){
                System.out.print(" ");
            }
            for (int n=1;n<=6;n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
//把一个复杂形状看着做长方形或者三角形等基础形状，把一个平行四边形看作时三角形长方形组合的部分