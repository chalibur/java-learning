package com.itheima.literl.SwitchDemo;

public class SwitchDemo4 {
    /*
    switch新特性：（JDK 12/14以上）
    1.箭头标识：->并且加上大括号{}
    2.省略break关键字，默认会自动break
    3.default也是一样的
    4.yield关键字：返回一个值
     */
    public static void main (String[] args){
        int month=3;
        switch(month){
            case 12,1,2->System.out.println("winter");
            case 3,4,5->System.out.println("spring");
            case 6,7,8->System.out.println("summer");
            default->System.out.println("autumn！");
        }
    }
}

