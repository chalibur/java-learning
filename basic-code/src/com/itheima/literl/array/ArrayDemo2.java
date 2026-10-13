package com.itheima.literl.array;

public class ArrayDemo2 {
    //数组的元素访问
    /*
    索引就是一个数组的一个编号，也叫做角标，下标，编号
    从0开始，连续+1，中间不间断
     */
    public static void main(String[] args){
        int age_array[]={28,29,20};
        System.out.println(age_array[1]);

        //获取数组中的元素
        int num =age_array[0];
        System.out.println(num);

        int num2=age_array[1];
        System.out.println(num2);

        //修改数组中的元素
        age_array[1]=31;
        System.out.println(age_array[1]);
    }
}
