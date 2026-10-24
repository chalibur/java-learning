package com.itheima.oopentendstest2;

public class LapTop {
    String brand;//品牌
    int price;//价格

    public LapTop() {
    }

    public LapTop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void Coding(){
        System.out.println("正在使用"+brand+"笔记本电脑Coding");
    }
}
