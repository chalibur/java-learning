package com.itheima.bigintegerAndbigdecimal;

import java.math.BigInteger;

public class Test2 {
    public static void main(String[] args){
        BigInteger b1 = BigInteger.valueOf(100);
        BigInteger b2 = BigInteger.valueOf(10);
        //加法
        BigInteger b3=b1.add(b2);
        System.out.println("b3="+b3);//创建了一个新的对象，并没有实际影响b1和b2
        //减法
        BigInteger b4=b1.subtract(b2);
        System.out.println("b4="+b4);
        //乘法
        BigInteger b5=b1.multiply(b2);
        System.out.println("b5="+b5);
        //除法
        BigInteger b6=b1.divide(b2);
        System.out.println("b6="+b6);
        //取余
        BigInteger[] b7= b1.divideAndRemainder(b2);
        for (int i = 0; i < b7.length; i++) {
            System.out.println("b7["+i+"]="+b7[i]);
        }
        //次方
        BigInteger b8 = b1.pow(2);
        System.out.println("b8="+b8);

        //最大在最小值
        System.out.println("b1.max(b2)="+b1.max(b2));
        System.out.println("b1.min(b2)="+b1.min(b2 ));
    }
}




