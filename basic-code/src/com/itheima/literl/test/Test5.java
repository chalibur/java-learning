package com.itheima.literl.test;

public class Test5 {
    /*题目要求：
    给定n个非负整数表示宽度为一的柱子的高度图，计算按此排列的柱子，下雨之后能接住多少雨水
    输入：
    height=【0，1，0，2，1，0，1，3，2，1，2，1】
    输出：6
    解释：下面是由数组【0，1，0，2，1，0，1，3，2，1，2，1】表示的高度图
    可以接6个单位的雨水（蓝色部分表示雨水）
     */
    public static void main(String[] args){
        //1.定义一个数组，表示柱子数量
        int []arr={0,1,0,2,1,0,1,3,2,1,2,1};

        //2.从左到右开始遍历，找到雨水+柱子的总和
        int leftMax[]=new int [arr.length];
        //2.1定义第三方变量进行比较
        int temp=arr[0];
        //2.2开始遍历
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>temp){
              temp=arr[i];
            leftMax[i]=temp;
            }else
                leftMax[i]=temp;
        }
        for (int i = 0; i < leftMax.length; i++) {
            System.out.print(leftMax[i]+" ");
        }
        System.out.println();
        //3.从右到左开始遍历，找到雨水+柱子的总和
        int rightMax[]=new int [arr.length];
        int temp2=arr[arr.length-1];
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]>temp2){
                temp2=arr[i];
                rightMax[i]=temp2;
            }else
                rightMax[i]=temp2;
        }
        for (int i = 0; i < rightMax.length; i++) {
            System.out.print(rightMax[i]+" ");
        }
        System.out.println("");

        //4.定义一个新的数组，对leftMax和rightMax进行比较，取小值
        int minarr[]=new int [arr.length];
        for (int i = 0; i < minarr.length; i++) {
            if (leftMax[i]<rightMax[i]){
                minarr[i]=leftMax[i];
            }
            else
                minarr[i]=rightMax[i];
        }
            for (int i = 0; i < minarr.length; i++) {
            System.out.print(minarr[i]+" ");
        }
        System.out.println("");
            //5.minarr是水+格子数，再减去arr里的数据，最终的得到的数组求和就是接的水
        int reslutarr[]=new int[arr.length];
        for (int i = 0; i < reslutarr.length; i++) {
            reslutarr[i]=minarr[i]-arr[i];
        }
        int sum=0;
        for (int i = 0; i < reslutarr.length; i++) {
            sum+=reslutarr[i];
        }
        System.out.println("接的水是："+sum);
    }
}
