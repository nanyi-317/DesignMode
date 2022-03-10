package com.yibao.factory.configFactory;

/**
 * @author yibao
 * @create 2022 -03 -10 -9:55
 */
public abstract class Coffee {
    // 获取咖啡的名称
    public abstract String getName();

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
