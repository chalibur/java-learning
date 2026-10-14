package com.itheima.literl.method;

import java.util.Random;

public class MethodDemo2 {
    /*获取十个1-100的随机数并存入到数组当中，并且保证数据是唯一的

     */
    public static void main(String[] args) {
        //1.创建长度为10的数组
        int arr[] = new int[10];
        //2.获取随机数并且检查数组中是否有相同的数字
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            //获取 1-100 之间的随机数
            int num = r.nextInt(1, 101);
            //如果数组中已经存在该数字，则重新获取，保证数据唯一
            if(!contains(num, arr)) {
                arr[i] = num;
                i++;
            }
            //把唯一的随机数存入数组

        }
        //3.遍历数组并输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    //定义一个方法判断数字是否在数组中存在
    public static boolean contains(int num, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;

            }//如果遇到相同的数字，方法直接结束，此前的方法直接结束
        }
        return false;
    }
}


