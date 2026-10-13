package com.itheima.literl.operator;

public class operator1
{
    public static void main() {
         /*
    算术运算符：+ - * / % ++ --
     */
        int a=10;
        int b=20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//整数相除结果还是整数
        System.out.println(a%b);
        System.out.println("------------------");
        //细节：小数直接参与计算是有可能会不精确的
        //一定要进行精确运算后续讲到
        double c=12.5;
        double d=343.1;
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c%d);
    }
}
