package com.itheima.literl.array;

import java.util.Random;

public class ArrayDemo9 {
    /*
    需求：获取十个从1-100之间的随机数并存到数组当中去，要求保证数据是唯一的
     */
    //为什么有问题？
    //默认初始化为0，当random的数值在数组中已经存在了，就会替换为0
    public static void main(String[] args) {
         //1.创建长度为10的数组
        int arr[]=new int [10];
        //2.获取随机数并且检查数组中是否有相同的数字
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int num=r.nextInt(15);
            //定义一个计数器，如果存在相同的元素，就不能和放入数组
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(num==arr[j]){
                    count++;
                    break;}
            }
            if(count==0) {
                arr[i] = num;
                //当真正的存入一个数字之后才能递增
                i++;
            }
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }

        }
     }


