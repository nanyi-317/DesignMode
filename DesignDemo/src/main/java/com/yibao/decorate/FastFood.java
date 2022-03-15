package com.yibao.decorate;

/**
 * 抽象类：快餐
 * @author yibao
 * @create 2022 -03 -15 -13:50
 */
public abstract class FastFood {
    // 价格
    private float price;
    // 描述
    private String desc;
    // 方法：计算价格
    public abstract float cost();

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
