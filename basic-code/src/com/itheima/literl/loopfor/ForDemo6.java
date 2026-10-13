package com.itheima.literl.loopfor;

public class ForDemo6 {
    /*
   数字规律：
   有一组特殊的数据，从第三项开始，每一项都是前两项的数字和，请问第十项的数字是多少
   0.1.1.2.3.5.8.13.21.34，55，89
     */
    public static void main(String[] args){
        int a=0;
        int b=1;
        int c=0;
        for(int i=3;i<=10;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

    }
}
