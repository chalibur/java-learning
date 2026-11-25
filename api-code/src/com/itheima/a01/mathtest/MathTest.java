package com.itheima.a01.mathtest;

public class MathTest {
    public static void main(String[] args){
        /*
        math
        是java里面已经写好的一个类，里面有很多方法，用于进行数学计算，
        不能创建对象，只能使用里面的方法
         */
        //abs获取一个整数的绝对值
        int abs = Math.abs(-10);
        System.out.println(abs);

        //ceil向上取整
        double ceil = Math.ceil(10.1);
        System.out.println(ceil);

        //floor向下取整
        double num2=Math.floor(10.22);
        System.out.println(num2);

        //round四舍五入
        long round = Math.round(10.5);
        System.out.println(round);
        //负数的情况不一样
        //当负数的小数位是0.5时，会采用舍去操作
        //round规则：返回与参数最接近的long值，当有多个的时候则返回正无穷大方向
        System.out.println(Math.round(-10.5));
        System.out.println(Math.round(-10.4));

        //Max返回两个数据中的大值
        System.out.println(Math.max(10, 20));

        //Min返回两个数据中的小值
        System.out.println(Math.min(10, 20));

        //pow返回a的b次方
        System.out.println(Math.pow(2, 3));
        //隐藏用法：开根号
        System.out.println(Math.pow(4, 0.5));//平方根sqrt（），立方根cbrt（）


    }
}
