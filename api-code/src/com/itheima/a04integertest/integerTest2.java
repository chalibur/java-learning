package com.itheima.a04integertest;

public class integerTest2 {
    /*
    Integer常见的成员方法
    1.将包装类装换成基本数据类型
    int intValue()
    2.将int转换为Integer对象
    static Integer valueOf(int i)
    3.将Integer对象转换为字符串
    String toString()
    4.将字符串转化成int
    static int parseInt(String s)
    5.进制转化
    o
     */
    public static void main(String[] args){
        Integer i = new Integer(10);
        System.out.println(i);
        int num=i.intValue();
        System.out.println(num);
        int num2=Integer.parseInt("10");
        System.out.println(num2+900);//如果是字符串的话，做的是拼接操作
        //如果是基本数据类型的话，做的就是相加操作


    }
}
