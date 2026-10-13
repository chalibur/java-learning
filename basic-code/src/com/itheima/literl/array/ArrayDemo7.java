package com.itheima.literl.array;

public class ArrayDemo7 {
    /*
    需求：
    已知数组元素为{33，5，22，44，55}
    请找出数组中的最大值并且打印到控制台
     */
    //细节1：循环的开始条件可以不可以为0，对结果是否有影响？可以，对结果没有影响，只不过循环会再次执行一次

    //细节2：max的值是否可以赋值为0？不可以，当初始数组全部都为负数的时候，将会出现错误结果

    public static void main(String[] args){
        int arr[]={33,5,22,44,55};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("数组的最大值是："+max);
    }
}
