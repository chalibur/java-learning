package com.itheima.literl.looploop;

public class Text6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            //先打印右上角红色部分
            for (int j = i; j <=2; j++) {
                System.out.print(" ");
            }
            //在打印中间绿色部分
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            //接着打印中间蓝色部分
            for (int l = 1; l <= 3; l++) {
                System.out.print("*");
            }
            //接着打印蓝色部分4
            for (int n = i; n <= 2; n++) {
                System.out.print("*");
            }
            //最后打印右下角红色部分
            for (int m = i; m >=2; m--) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
/*
静态初始化：是指在定义数组的同时，给数组元素赋初值
静态：定义变量，数组，直接给数组进行赋值
动态初始化：是指在定义数组的同时，不给数组元素赋初值，数组元素的值为默认值
int arr[]=new int []{1,2,3,4,5};    完整格式
int arr[]={1,2,3,4,5}               简写格式

注意：
1.数组是一个连续的空间，数组里面的没一个小格子并不是散的，而是连续绑定在一起的
2.数组一旦定义之后，长度即不能再改变
 */
