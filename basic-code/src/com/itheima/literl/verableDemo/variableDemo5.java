package com.itheima.literl.verableDemo;

public class variableDemo5 {
    public static void main(String[] args) {
        //BMI=体重/身高的平方（体重单位kg，身高单位m）
        double weight=68.9;
        double height =1.93;
        //直接计算BMI
        double bmi = weight / (height * height);
        System.out.println(bmi);
        double weight2 =64;
        double height2=1.83;
        double bmi2 = weight2 / (height2 * height2);
        System.out.println(bmi2);
        /*
        标识符的命名规则：
        1.标识符由字母、数字、下划线、美元符号组成
        2.标识符不能以数字开头
        3.标识符不能是关键字
        4.标识符区分大小写
        软性要求：
        1.标识符应该有含义
        2.标识符应该使用小驼峰命名法
         */
        /*
        键盘录入:
        1.找到scanner
        2.让scanner干活
         */

    }
}
