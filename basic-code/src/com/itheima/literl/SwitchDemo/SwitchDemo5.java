package com.itheima.literl.SwitchDemo;

import java.util.Scanner;

public class SwitchDemo5 {
    /*case穿透现象：
    当我们没有写break的时候，就会出现case穿透的现象，即会执行下一个case的语句，直到遇到break为止
    仍然会进行匹配，当进行匹配的时候没有break，就会继续运行下一个case的语句，直到遇到break为止

    应用：节省代码，示例如下：

   */

    public static void main(String[] args) {
        System.out.println("输入一个月份：");
        Scanner sc =new Scanner(System.in);
                int month = sc.nextInt();
        switch(month){
            case 12:
                System.out.println("冬季");
            case 1:
                System.out.println("冬季");
            case 2:
                System.out.println("冬季");
                break;
            case 3:
                System.out.println("春季");
            case 4:
                System.out.println("春季");
            case 5:
                System.out.println("春季");
                break;
                //后面省略
        }
    }
}
