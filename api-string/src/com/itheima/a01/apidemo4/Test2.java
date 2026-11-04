package com.itheima.a01.apidemo4;

public class Test2 {
    /*
    字符串的替换
    String replace(旧值，新值)
    只有返回值是替换之后的结果

    需求：过滤玩游戏中骂人的话
     */
    public static void main(String[] args){

        String str="你玩的好菜啊，他妈的";

        String str2=str.replace("他妈的","***");
        System.out.println(str2);
    }

}
