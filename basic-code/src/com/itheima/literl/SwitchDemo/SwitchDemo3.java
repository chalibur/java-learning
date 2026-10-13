package com.itheima.literl.SwitchDemo;

public class SwitchDemo3 {
    /*运用switch语句来模拟计算器

     */
    //尤其需要注意将switch的结果赋值给一个变量，switch大括号必须要加分号；
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String operator="*";
        int result=switch (operator) {
            case"*"->a*b;
            case"+"->a+b;
            case"-"->a-b;
            case "/"->a/b;
            default->0;
        };
        System.out.println(result);
    }
}
