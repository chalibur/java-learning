package com.itheima.a01.apidemo3;

import java.util.Scanner;

public class Test1 {
    /*
    Boolean euqals
    Boolean equalIgnoreCase
    需求：已知正确的用户名和密码，请用程序实现模拟用户登录
     总共给三次机会，登录之后，给出相应的提示
     */
    /*
    字符串比较的两个方法：
    equals
    equalsIgnoreCase
     */
    public static void main(String[] args){
        String rightUsername="ZhangSan";
        String rightPassword="123456";

        //让用户键盘录入登陆的用户名和密码，判断是否登录成功
        Scanner sc=new Scanner(System.in);


        //进行比较
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String username=sc.next();
            System.out.println("请输入密码：");
            String password=sc.next();
            //如果对布尔类型的代码进行判断，建议把直接写道if括号里面
            if(username.equalsIgnoreCase(rightUsername)&&password.equals(rightPassword)){
                System.out.println("登录成功");
                break;
            } else{
             if(i==3){
                 System.out.println("登录失败，您已输错三次，请稍后再试");
             }else {
                 System.out.println("登录失败,请重新登陆，您还有" + (3 - i) + "次机会");
             }

            }

        }

    }

}
