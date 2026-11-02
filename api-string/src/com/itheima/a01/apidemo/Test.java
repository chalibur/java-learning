package com.itheima.a01.apidemo;

import java.util.Random;//导包，定位random的位置、
//如果使用本包的包，不需要导包
//如果使用java.lang包也不需要导包，因为这个是java里面最基础的包
//除了以上两种情况，其他所有情况都需要导包

public class Test {
    public static void main(String[] args ){
        //1.创建random对象
        Random r=new Random();
        //调用方法获得一个随机的小数
        double num =r.nextDouble();
        System.out.println(num);
        //调用方法获得一个随机的小数,参数为范围
        double num2=r.nextDouble(10);
        System.out.println(num2);
        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextDouble(10));
        }


        //字符串的内容是不能改变的，它的对象在创建之后不能被更改
        /*
        string是java已经定义好的一个类
        java程序中所有双引号的内容都是string的一个类
        类里的内容不可变
         */
    }
}
