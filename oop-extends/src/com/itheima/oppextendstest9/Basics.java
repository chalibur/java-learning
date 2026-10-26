package com.itheima.oppextendstest9;

public class Basics {
    private String number;//单号
    private int weight;//重量
    private String member;//收件人

    //构造函数

    public Basics() {
    }

    public Basics(String number, int weight, String member) {
        this.number = number;
        this.weight = weight;
        this.member = member;
    }
    //get和set方法

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }
    //成员方法
    public int calculateFee() {
        int fee=10*weight;
        return fee;
    }
}
