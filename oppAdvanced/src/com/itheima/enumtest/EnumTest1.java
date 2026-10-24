package com.itheima.enumtest;

public class EnumTest1 {
    /*
    电商项目中，订单的状态只有下面六种，请编写代码实现：
    待支付、处理中、已发货、配送中、已送达、已取消
     */

    public static void main(String [] args){
        //获取枚举类的对象
        //所有的枚举类默认使用public static final修饰
        OrderState o1 = OrderState.PAYMENT_PENDING;
        System.out.println(o1.getName());
        switch(o1){
            case PAYMENT_PENDING -> System.out.println("待支付");
        case PROCESSING -> System.out.println("处理中");
        case SHIPPED -> System.out.println("已发货");
        case DELIVERED -> System.out.println("已送达");
        case CANCELED -> System.out.println("已取消");
        }
    }


}
