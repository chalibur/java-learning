package com.itheima.a04integertest;

public class integertest {
    /*
    获取integer对象的方式
    1.构造方法
    2.静态方法
    3.直接赋值
     */
    public static void  main(String[] args){
        //1.使用构造方法
        Integer i1=new Integer(10);
        Integer i2=new Integer("10");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1==i2);//结果为false，因为引用数据类型比较的是内存地址

        //2.使用静态方法
        /*
        当Integer被加载到内存的时候，会创建一个范围在-128到127之间的Integer对象，一共创建了256个对象，放到一个数组当中
        当我们用Integer.valueOf("200")的时候，会先判断这个对象是否在-128到127之间，如果在之间，就会返回数组中的对象，如果不在之间，就会创建一个新的对象
        如果在就不会创建新的对象
        如果不在就会用构造方法创造新的对象
         */
        Integer i3=Integer.valueOf("100");
        Integer i4=Integer.valueOf(100);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i3==i4);

        //3.直接赋值
        Integer i5=300;
        System.out.println(i5);

    }
}
