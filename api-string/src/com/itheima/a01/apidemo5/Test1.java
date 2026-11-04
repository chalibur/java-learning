package com.itheima.a01.apidemo5;

public class Test1 {
    /*
    String方法汇总：
    contains()：判断字符串中是否包含指定的字符或字符串
    startsWith()：判断字符串是否以指定的字符或字符串开始
    endsWith():判断字符串是否以指定的字符或字符串结束
    indexOf()：返回指定字符或字符串在此字符串中第一次出现的索引

     */
    public static void main(String [] args){
        //contains()
        String str="abcdefg";
        System.out.println("是否含有abc： "+str.contains("abc"));
        //startWith()
        System.out.println("是否以ab开头 "+str.startsWith("ab"));
        System.out.println("是否以de结尾 "+str.endsWith("de"));
        //indexOf()
        //如果当前查找的字符不存在，返回的是负数，表示没有找到
        System.out.println("c第一次出现的下标是 "+str.indexOf("c"));
        //lastindexOf()
        System.out.println("c最后一次出现的下标是 "+str.lastIndexOf("c"));
        //isEmpty()
        System.out.println("字符串是否为空 "+str.isEmpty());
        //trim()去掉头尾空格
        System.out.println("去空格 "+str.trim());
    }

}
