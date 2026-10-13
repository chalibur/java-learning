package com.itheima.literl.loopfor;

public class ForDemo4 {
    /*
    需求：
    在实际开发中，想要获得一个范围的每一数据时，会用到循环，但是，如果想要获得其中符合要求的数据，
    此时就需要循环，和其他语句结合使用了
    比如：求1-100之间的偶数和
     */
    public static void main(String[] args) {
       int sum=0;
//       for(int i=1;i<=100;i++){
//           if(i%2==0)
//           sum=sum+i;
//       }
//        System.out.println(sum);
        for(int i=2;i<=100;i+=2){
            sum=i+sum;
            System.out.println(sum);
        }
    }
}
