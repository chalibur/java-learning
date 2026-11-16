package com.itheima.a01.apitest;

public class Test5 {
    /*
    数据脱敏：
    把任意手机号中间四位变成****
    保留邮箱名的第一个字母，表六@后面的内容

    比如：
    13112345678     131****5678
    zw1234@163.com    z*****@163.com
     */
    public static void main(String[] args){
        String phone ="13112345678";
        String email="zw1234@163.com";

        System.out.println("手机号脱敏："+phone.substring(0,3)+"****"+phone.substring(7));
        int index=email.indexOf("@");
        System.out.println("the index of'@' is:"+index);
        System.out.print("邮箱脱敏："+email.substring(0,1));
        String email1=email.substring(1,index);
        for (int i = 0; i < email1.length(); i++) {
            System.out.print("*");
        }
        System.out.print(email.substring(index,email.length()));
    }
}
