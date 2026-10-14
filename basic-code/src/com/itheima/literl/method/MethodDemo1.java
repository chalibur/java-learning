package com.itheima.literl.method;

public class MethodDemo1 {
    /*
    练习：定义一个方法，求两个数的和

    1.main方法仍然是是一个方法，所以getsum方法不能写在main方法里
    2.小括号里面的参数必须一一对应
    3.方法是不能自己运行的，方法必须被调用才能使用
    4.形参和实参的区别：形参是方法定义时使用的变量，实参是方法调用时传递的值
    5.方法名和参数必须一一对应
     */
    public static int getsum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        System.out.println(getsum(10,20));
    }
}
