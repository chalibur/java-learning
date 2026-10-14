package com.itheima.literl.array;

import java.util.Random;

public class ArrayDemo8 {
    /*
    前置联系：交换两个变量的数据
    需求：已知数组为【1，2，3，4，5，6，7，8，9，10】
    需求：打乱数组中的数据
     */
    public static void main(String[] args) {
         int a=10;
         int b=20;
         int temp;
         temp=a;
         a=b;
         b=temp;
        System.out.println(a);
        System.out.println(b);

        //1.将0索引的数据和任意位置上的数据进行交换、
        //2.从第二部开始，重复上面的过程
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        Random r=new Random();
        int randomIndex=r.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int tem;
            tem=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=tem;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
/*
细节:如何获得随机的索引
 */
/*
方法：

public statcic
 */