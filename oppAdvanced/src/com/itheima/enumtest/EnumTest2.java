package com.itheima.enumtest;

public class EnumTest2 {
    public static void main(String[] args){
        OrderState[] arr = OrderState.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("-------------------------");
        OrderState o1 = OrderState.valueOf("PAYMENT_PENDING");
        System.out.println(o1);
    }
}
