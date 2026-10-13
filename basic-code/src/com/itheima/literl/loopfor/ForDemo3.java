package com.itheima.literl.loopfor;

public class ForDemo3 {
    /*
    需求：在实际开发中，如果获取一个范围中的每一个数据时，也会用到循环
    要求，求1-5的和
     */

    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=5;i++){

            sum= i+sum;
            System.out.println(sum);
        }
    }
}
