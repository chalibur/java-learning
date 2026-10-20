package com.itheima.literl.test;

public class Test3 {
    /*
    题目要求：
    给定两个正序数组arr1和arr2，请先合并数组，并找出合并之后数组的中位数
    举例：
    123456789    中位数：5
    123456       中位数（3+4）/2
     */

    public static double getmiddle(int []arr){
        int len=arr.length;
        int middle=0;
        if(len%2==1){
            middle=arr[len/2];
        }
        else{
            middle=(arr[len/2-1]+arr[len/2])/2;
        }
        return middle;
    }
    public static void main(String[] Args){
        //定义数组
        int []arr1={1,3,5,7,9};
        int []arr2={2,4};
        //先确定这两个数据的中位数
        double middle1=getmiddle(arr1);
        double middle2=getmiddle(arr2);
        System.out.println("数组1的中位数是："+middle1);
        System.out.println("数组2的中位数是："+middle2);
        //合并数组,把两个小数组的数据，放到大数组当中，而且要保证正序
        //粗暴的方式，不管顺序，直接把arr1和arr2里面的数据添加到arr里面
        //添加完毕，在排序，思路简单，但是太暴力，效率不高


        int []arr3=new int [arr1.length+arr2.length];
        //实现思想：通过循环把arr1和arr2里面的数据添加到arr里面
        //设置两个索引，分别指向arr1和arr2
        //将arr1的索引与arr2的索引进行比较，将较小的数据添加到arr里
        //重复这个过程，直到arr1或arr2里面的数据添加完毕
        int index1=0;
        int index2=0;
            for (int i = 0; i < arr3.length; i++) {
                //如果arr1是短的
                if(index1==arr1.length){
                    arr3[i]=arr2[index2];
                    index2++;
                    continue;//！！！！！跳过本次循环的剩余部分，继续下一次循环
                }
                //如果arr2是短的
                if(index2==arr2.length){
                    arr3[i]=arr1[index1];
                    index1++;
                    continue;
                }
                if (arr1[index1] <= arr2[index2]) {
                    arr3[i] = arr1[index1];
                    index1++;
                } else {
                    arr3[i] = arr2[index2];
                    index2++;
                }
            }
        System.out.println("合并之后的数组是：");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");

        } System.out.println();
        System.out.println("合并之后的数组的中位数是："+getmiddle(arr3));
    }

    }

