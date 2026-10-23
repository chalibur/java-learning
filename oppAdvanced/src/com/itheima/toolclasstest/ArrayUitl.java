package com.itheima.toolclasstest;

public class ArrayUitl {

    private ArrayUitl() {
    }//私有化构造方法，目的：不让外界创造对象

    //定义方式：静态
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return (double) sum / arr.length;
    }
}

