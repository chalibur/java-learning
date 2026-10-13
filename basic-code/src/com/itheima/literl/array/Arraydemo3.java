package com.itheima.literl.array;

public class Arraydemo3 {
    /*
    数组的遍历：
    利用循环依次获得数组中的每一个元素并输出
     */
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println("数组的长度是："+arr.length);
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println(arr[i]);
        }
        //获取数组的长度
        //  arr.length
        //0-arr.length-1
        /*
        继续改进
         */
        for (int i = 0; i < arr.length; i++) {//实际只运行0-4，运行不到5
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            
        }
    }
}

/*遍历数组的快捷方式：
数组名.fori+enter
 */
