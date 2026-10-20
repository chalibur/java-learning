package com.itheima.literl.test;

public class Test1 {
    /*
    移除元素：
    给你一个数组nums和一个值val，你需要删除所有数值等于vals的元素
    举例1：
    输入：nums = [3,2,2,3], val = 3
    输出：【2,2,】剩余两个元素

    举例2：
    输入：nums=【0，1，2，2，3，0，4，2】 val = 2
    输出：【0，1，3，0，4】剩余五个元素
     */


    //快慢指针：
    //如果快指针与val相同则++，如果不同则将快指针指向的数字存入慢指针继续++
    //满指针如果存入，则++
    public static void main( String [] args){
    //定义一个数组
    int []arr={1,2,3,45,6,77,8,2,2,11,3,3};
    int val=2;
    int slow=0;
    int fast=0;
        for (fast= 0; fast < arr.length; ) {
            if(arr[fast]!=val){
                arr[slow]=arr[fast];
                slow++;
            }
            fast++;
        }
        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
