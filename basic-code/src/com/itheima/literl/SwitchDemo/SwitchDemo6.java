package com.itheima.literl.SwitchDemo;

public class SwitchDemo6 {
    public static void main(String[] args) {
    /*
    default的位置已经省略的情况
      位置：case和default的位置是没有上下之分的位置可以任意的书写
           为了观看比较方便，提高代码的可读性
      省略：default是可以省略不写的，但是如果没有可匹配的结果，将不会输出任何语句，但是代码并不会报错
    case穿透现象：
    当我们没有写break的时候，就会出现case穿透的现象，即会执行下一个case的语句，直到遇到break为止
    仍然会进行匹配，当进行匹配的时候没有break，就会继续运行下一个case的语句，直到遇到break为止

    应用：

     */
        int week=11;
        switch(week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default :
                System.out.println("没有这个星期！");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;

        }
    }
}
