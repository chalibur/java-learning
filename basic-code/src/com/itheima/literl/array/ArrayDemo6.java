package com.itheima.literl.array;

import java.util.Scanner;

public class ArrayDemo6 {
    /*
    需求：已知数组元素是{33，5，22，44，55，33}
    键盘录入任意一个数据，检查这个数据在数组中是否存在
    如果数组中要查找的数据出现多次
    只需要显示第一次的索引即可
    输出要求：
    如果存在打印索引
    如果不存在，提示：“该数据不存在”
     */
    public static void main(String[] args){
        //1.定义数组
        int arr[]={33,5,22,44,55,33};
        //2.键盘录入任意一个数据
        System.out.println("请输入一个数字");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        //3.遍历数组，将number和数组中的每一个元素进行比较
        boolean flag=false;
        //或者用count，如果count数为0，则可以判定为数据不存在
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                System.out.println("索引是"+i);
                flag=true;
                break;
            }
            //数组中的所有元素全部比较完毕之后，才能确定数组中的所有数据全部比较完毕
            }if(!flag){
                System.out.println("该数据不存在");
        }

    }
}
