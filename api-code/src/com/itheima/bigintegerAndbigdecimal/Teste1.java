package com.itheima.bigintegerAndbigdecimal;

import java.math.BigInteger;

public class Teste1 {
    public static void main(String [] args){
        //构造方法获取对象
        BigInteger b1=new BigInteger("99999999999999999999999999999");
        //每次都是创建了一个新的对象
        System.out.println(b1);
        BigInteger b2=new BigInteger("99999999999999999999999999999");
        System.out.println(b1==b2);//内存地址不同

        //利用静态方法
        //当BigInteger加载到内存的时候，提前把-16到16的BigInteger对象创建好了，其他数字的BigInteger对象不会创建
        //为了节省内存
        //valueOf静态方法只能容纳长度为19的数字，如果要获取的数字比较大，只能用构造方法的方式进行创建
        BigInteger bd3=BigInteger.valueOf(16);
        BigInteger bd4=BigInteger.valueOf(17);
        System.out.println(bd3==bd4);

        //直接创建，biginteger是没有这样的方式的
        //直接赋值只有八种包装类和String类型
    }
}
