package com.itheima.literl.array;

import java.util.Scanner;

public class ArrayDemo4 {
    /*
    动态初始化：
    创建数组的时候，没有指定数组的长度，那么数组的长度可以改变，也可以添加元素
    固定格式：
    数据类型 数组名[] = new 数据类型[数组的长度]
     */
    public static void main(String[] args){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入数组元素");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }


}
