package com.itheima.bigintegerAndbigdecimal;

import java.math.BigDecimal;

public class Test3 {
    /*
    BigDecimal的底层存储规则：
    1. 两个变量，一个变量存储数字的系数，一个变量存储数字的指数
    2.用byte的数组存储数字的系数，一个变量存储数字的指数
     */
    /*
    获取对象的方式：
    1. 构造方法
    2. valueOf静态方法
     */
    public static void main(String[] args){
        BigDecimal b1 = new BigDecimal("0.765");
        //给构造方法传递一个double类型的小数，会得到一个不精确的结果，可能会导致数据的丢失
        //原因：因为double还是以二进制的形式存储在计算机当中，所以传递给bigdecimal的时候就是不够精确的结果
        BigDecimal b2 = new BigDecimal("0.876");
        BigDecimal b3 = BigDecimal.valueOf(0.765);
        System.out.println("b1:"+b1);

    }
}
