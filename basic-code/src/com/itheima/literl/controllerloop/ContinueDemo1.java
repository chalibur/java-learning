package com.itheima.literl.controllerloop;

public class ContinueDemo1 {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {

            if(i==3){
                continue;
            }
            System.out.println(i);

        }
    }
}
//break不能单独书写，表示结束或者跳出
//continue表示结束本次循环，继续下次下一次循环
