package com.itheima.a02.Systemtest;

public class Test1 {
    /*
    System也是一个工具类，提供一些与系统相关的方法
    public static void main(String[] args) {
        //exit(int status)：退出程序
        //0：正常退出
        //非0：异常退出
         //system.currentTimeMillis()：返回当前时间与1970年1月1日0点0分0秒之间的时间差（以毫秒为单位）
        //通常用于统计程序运行时间

        //System.arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
         */
    public static void main(String[] args){
        //System.exit(0);
        System.out.println("hello world");
        System.out.println(System.currentTimeMillis());
         int []arr={1,2,3,4,5,6,7,8,9,10};
         int [] arr2=new int[10];
         System.arraycopy(arr,0,arr2,0,8);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

}
