package com.itheima.literl.array;

import java.util.Scanner;

public class ArrayDemo11 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("请输入一个target值");
        Scanner sc =new Scanner(System.in);
        int target=sc.nextInt();
        for (int i = 0; i < arr.length/2+1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+arr[j]==target)
                    System.out.println("找到和为target的两个整数，索引为"+i+"和"+j);
            }

        }
    }
}
