package com.itheima.literl.array;

public class ArrayDemo10 {
    /*需求
    给定义一个递增有序数组，去除其中重复的元素

    快慢指针，双指针：
    满指针：存入的位置
    快指针：找不重复的数据
    相等---舍弃快指针位置的数据，++
    不相等---慢指针++，将快指针的位置存入慢指针的位置
     */
    public static void main(String[] args){
        int arr[]={1,2,2,2,2,2,3,3,3,3,3};
        int slow =0;
        int fast=1;
        while(fast<arr.length) {
        //判断两个指针指向的数据是否相同
            if(arr[slow]!=arr[fast]){
                slow++;
            arr[slow]=arr[fast];}
            fast++;
        }

        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
