package com.itheima.literl.operator;

public class operatorDemo13 {
    //寻找7的有缘数，定义一个两位整数，只要该数字包含7或者是7的倍数，就是7的有缘数
     //定义一个整数
    public static void main(String[] args) {
        int number=77;
        //包含7；
        int ge=number%10;
        int shi=number/10;
        //判断是否是7的有缘数；
        Boolean result=ge==7||shi==7||number%7==0;
        System.out.println("reslut is:"+ result);
    }
}
/*
短路逻辑运算符：&& || ！
    &&：逻辑与，如果左边为false，右边不再判断
    ||：逻辑或，如果左边为true，右边不再判断
    !：逻辑非，取反

 */