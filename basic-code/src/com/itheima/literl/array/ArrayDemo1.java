package com.itheima.literl.array;

public class ArrayDemo1 {
    /*
静态初始化：是指在定义数组的同时，给数组元素赋初值
静态：定义变量，数组，直接给数组进行赋值
动态初始化：是指在定义数组的同时，不给数组元素赋初值，数组元素的值为默认值
int arr[]=new int []{1,2,3,4,5};    完整格式
int arr[]={1,2,3,4,5}               简写格式

注意：
1.数组是一个连续的空间，数组里面的没一个小格子并不是散的，而是连续绑定在一起的
2.数组一旦定义之后，长度即不能再改变
 */

    /*
    数组的静态初始化：
    1.定义数组储存三位同学的年龄
    2.定义数组储存三位同学的身高
    3.定义数组储存三位同学的名字
     */
    public static void main(String[] args){
        int ages[]={28,29,20};
        int ages2[]=new int[]{28,29,10};

        double heights[]={180.2,179.5,177.2};
        double heights2[]=new double []{123.4,189.4};
        String names[]={"zhangsan","lisi","wangwu"};
    }
}
