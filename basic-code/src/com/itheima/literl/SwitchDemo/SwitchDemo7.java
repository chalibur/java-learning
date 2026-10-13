package com.itheima.literl.SwitchDemo;

public class SwitchDemo7 {
    //case的选项是有限个的，优先使用switch；
    //判断的是一个范围，优先使用if语句
    //错误示范如下：
    public static void main(String[] args) {
        int score=85;
        switch (score){
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }
    }

}
