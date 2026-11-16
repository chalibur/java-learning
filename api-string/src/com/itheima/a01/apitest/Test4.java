package com.itheima.a01.apitest;



import java.util.Scanner;

public class Test4 {
    /*
    字符串计算：
    需求:定义两个字符串，记录为非负整数，求他们的和
    输入：“12395”和“133”，输出：“12528”
    注意：需要数据过大，超出int取值范围的情况
     */
    public static void main(String[] args) {
        //先输入两个字符串
        System.out.println("请输入两个字符串：");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        //2.把这两个字符串中的数据放到int类型的数组当中
        int len = str1.length() >= str2.length() ? str1.length() : str2.length();
        System.out.println("len is :" + len);
        int[] arr1 = copyData(str1, str1.length(), len);
        int[] arr2 = copyData(str2, str2.length(), len);
        System.out.println("arr1 is :");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "");
        }
        System.out.println("");
        System.out.println("arr2 is :");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "");
        }
        System.out.println("");
        //3.对数组当中的数据进行相加操作
        int carry = 0; //定义进位值
        int[] result = new int[len+1];//定义相加之后的数组
        for (int i = 0; i < result.length-1; i++) {
            result[i] = arr1[i] + arr2[i] + carry;
            if (result[i] >= 10) {
                carry = result[i] / 10;
                result[i] = result[i] % 10;

            } else {
                carry = 0;
            }
            //如果相加之后的数组当中，最高位有进位，需要在数组的最高位补1
            if (i == result.length-2 && carry > 0) {
                result[i+1] = carry;
            }
        }
        //输出结果需要反转
        System.out.println("result is :");
        for (int i = result.length-1; i >= 0; i--) {
            System.out.print(result[i] + "");
        }
    }

    //定义一个方法把数据放入放到int类型的数组当中,需要做到既要对字符串进行反转，又要把字符串转换成数字，
    // 同时对于没有的位数，需要在数组中补0
    public static int[] copyData(String str, int origionlen, int len) {
        int[] arr = new int[len];
        if (origionlen == len)
            for (int i = 0; i < arr.length; i++) {
                arr[i] = str.charAt(str.length() - 1 - i) - '0';
            }
        else {
            for (int i = 0; i < origionlen; i++) {
                arr[i] = str.charAt(str.length() - 1 - i) - '0';
            }
            for (int i = origionlen; i < len; i++) {
                arr[i] = 0;
            }
        } return arr;
    }
}

