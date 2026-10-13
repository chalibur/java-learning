package com.itheima.literl.operator;

import java.util.Scanner;

public class operatorDemo8 {
    /*
    1.键盘录入两个人的身高，比比谁的更高
    2.键盘录入一个三位数，判断是否可以被3整除
     */
public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入一个人的身高：");
    double height1=sc.nextDouble();
    System.out.println("请输入第二个人的身高：");
    double height2=sc.nextDouble();
    boolean result=height1>=height2;
    System.out.println("result="+result);

}
}
