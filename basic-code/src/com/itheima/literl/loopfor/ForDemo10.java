package com.itheima.literl.loopfor;

import java.util.zip.CheckedOutputStream;

public class ForDemo10 {
    /*
    需求：世界上最高的山峰珠穆朗玛峰8848.86米=8848860mm
    假如我有一张这足够大的纸，他的厚度是0.1毫米
    请问需要折叠多少次，才能让纸的厚度达到珠穆朗玛峰的高度？
     */
    public static void main(String[] args){
        double height=0.1;
        double expectheight=8848860;
        int count=0;
        while(height<=expectheight){
            height=height*2;
            count++;
        }
        System.out.println("需要折叠"+count+"次");
    }
}
